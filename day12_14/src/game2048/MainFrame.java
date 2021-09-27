package game2048;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener, ActionListener {

    int[][] datas = new int[4][4];

    // 是否展示失败图片的开关 :  1不展示  2展示
    int loseFlag = 1;

    // 得分
    int score = 0;

    // 图片资源的标识
    String theme = "A-";

    // 将item对象提取到成员变量的位置, 是为了便于其他方法的访问.
    JMenuItem item1 = new JMenuItem("经典");
    JMenuItem item2 = new JMenuItem("霓虹");
    JMenuItem item3 = new JMenuItem("糖果");

    /**
     * 构造方法
     */
    public MainFrame() {
        // 初始化窗体
        initFrame();
        // 初始化菜单
        initMenu();
        // 初始化数据
        initData();
        // 绘制界面
        paintView();
        // 为窗体添加键盘监听
        this.addKeyListener(this);
        // 设置窗体可见
        setVisible(true);
    }

    /**
     * 此方法用于初始化菜单(换肤,关于我们)
     */
    public void initMenu() {
        // 1. 创建JMenuBar (木棍)
        JMenuBar menuBar = new JMenuBar();
        // 2. 创建栏目对象 JMenu (换肤, 关于我们)
        JMenu menu1 = new JMenu("换肤");
        JMenu menu2 = new JMenu("关于我们");


        menuBar.add(menu1);
        menuBar.add(menu2);

        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item2);
        menu1.add(item3);

        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);

        // 4. 给窗体对象设置菜单.
        setJMenuBar(menuBar);

    }

    /**
     * 该方法用于初始化数据 -- datas数组进行初始化
     */
    public void initData() {
        generatorNum();
        generatorNum();
    }

    /**
     * 此方法用于初始化窗体, 所有窗体的相关设置都在这个方法中完成
     */
    public void initFrame() {
        // 设置宽和高
        setSize(514, 538);
        // 设置窗体居中
        setLocationRelativeTo(null);
        // 设置窗体置顶
        setAlwaysOnTop(true);
        // 设置关闭模式
        setDefaultCloseOperation(3);
        // 设置窗体标题
        setTitle("2048小游戏");
        // 取消默认布局
        setLayout(null);
    }

    /**
     * 此方法用于绘制游戏界面
     */
    public void paintView() {
        // 移除掉, 界面中所有的内容
        getContentPane().removeAll();

        if (loseFlag == 2) {
            JLabel loseLabel = new JLabel(new ImageIcon("E:\\develop\\素材\\2048\\image\\" + theme + "lose.png"));
            loseLabel.setBounds(90, 100, 334, 228);
            getContentPane().add(loseLabel);
        }

        for (int i = 0; i < 4; i++) {
            // i = 0 1 2 3
            for (int j = 0; j < 4; j++) {
                // j = 0 1 2 3
                JLabel image = new JLabel(new ImageIcon("E:\\develop\\素材\\2048\\image\\" + theme + datas[i][j] + ".png"));
                image.setBounds(50 + 100 * j, 50 + 100 * i, 100, 100);
                getContentPane().add(image);
            }
        }

        JLabel background = new JLabel(new ImageIcon("E:\\develop\\素材\\2048\\image\\" + theme + "Background.jpg"));
        background.setBounds(40, 40, 420, 420);
        getContentPane().add(background);

        JLabel scoreLabel = new JLabel("得分: " + score);
        scoreLabel.setBounds(50, 20, 100, 20);
        getContentPane().add(scoreLabel);

        // 刷新界面的方法
        getContentPane().repaint();
    }

    /**
     * 此方法用于数据的左移动
     */
    public void moveToLeft() {
        for (int i = 0; i < datas.length; i++) {
            // 1. 后置0号元素
            int[] newArr = new int[4];
            int index = 0;
            for (int x = 0; x < datas[i].length; x++) {
                if (datas[i][x] != 0) {
                    newArr[index] = datas[i][x];
                    index++;
                }
            }

            datas[i] = newArr;

            // 2. 合并元素之后, 后续元素前移, 并在末尾补0.
            for (int x = 0; x < 3; x++) {
                if (datas[i][x] == datas[i][x + 1]) {
                    datas[i][x] *= 2;

                    // 计算得分
                    score += datas[i][x];

                    // 后续元素前移, 并在末尾补0.
                    for (int j = x + 1; j < 3; j++) {
                        datas[i][j] = datas[i][j + 1];
                    }

                    datas[i][3] = 0;
                }
            }
        }
    }

    /**
     * 此方法用于整合四个移动的判定
     */
    public void check() {
        if (checkLeft() == false && checkRight() == false && checkTop() == false && checkBottom() == false) {
            // 失败的状态.
            loseFlag = 2;
        }
    }

    /**
     * 此方法用于二维数组的数据拷贝
     *
     * @param src  原数组
     * @param dest 目标数组
     */
    public void copyArray(int[][] src, int[][] dest) {
        for (int i = 0; i < src.length; i++) {
            for (int j = 0; j < src[i].length; j++) {
                dest[i][j] = src[i][j];
            }
        }
    }

    /**
     * 此方法判断是否可以左移动
     */
    public boolean checkLeft() {
        // 1. 创建新数组, 用于备份原数组数据.
        int[][] newArr = new int[4][4];
        // 2. 将原数组数据, 拷贝到新数组中.
        copyArray(datas, newArr);
        // 3. 调用左移动方法, 对原数组数据进行左移动
        moveToLeft();

        // 4. 使用移动后的数据, 和备份的数据逐个进行比对, 并使用flag变量进行记录.
        // 设计思路:
        // true : 可以移动
        // false : 不可以移动.
        boolean flag = false;
        // datas : 2
        // newArr : 0
        lo:
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if (datas[i][j] != newArr[i][j]) {
                    // 主要元素有一个是不相同的, 就代表数据可以变化, 数据可以移动.
                    flag = true;
                    break lo;
                }
            }
        }

        // 5. 确定信息后, 恢复原数组数据(再做一次拷贝)
        copyArray(newArr, datas);

        // 6. 返回结果信息.

        return flag;
    }

    /**
     * 此方法判断是否可以右移动
     */
    public boolean checkRight() {
        int[][] newArr = new int[4][4];
        copyArray(datas, newArr);
        moveToRight();
        boolean flag = false;
        lo:
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if (datas[i][j] != newArr[i][j]) {
                    flag = true;
                    break lo;
                }
            }
        }
        copyArray(newArr, datas);
        return flag;
    }

    /**
     * 此方法判断是否可以上移动
     */
    public boolean checkTop() {
        int[][] newArr = new int[4][4];
        copyArray(datas, newArr);
        moveToTop();
        boolean flag = false;
        lo:
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if (datas[i][j] != newArr[i][j]) {
                    flag = true;
                    break lo;
                }
            }
        }
        copyArray(newArr, datas);
        return flag;
    }

    /**
     * 此方法判断是否可以下移动
     */
    public boolean checkBottom() {
        int[][] newArr = new int[4][4];
        copyArray(datas, newArr);
        moveToBottom();
        boolean flag = false;
        lo:
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if (datas[i][j] != newArr[i][j]) {
                    flag = true;
                    break lo;
                }
            }
        }
        copyArray(newArr, datas);
        return flag;
    }

    /**
     * 此方法用于处理二维数组的反转
     */
    public void horizontalSwap() {
        for (int i = 0; i < datas.length; i++) {
            // 调用reverseArrays方法, 对每一个一维数组进行反转.
            reverseArray(datas[i]);
        }
    }

    /**
     * 此方法用于处理一维数组的反转
     */
    public void reverseArray(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    /**
     * 此方法用于处理数据顺时针旋转
     */
    public void clockwise() {
        int[][] newArr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                newArr[j][3 - i] = datas[i][j];
            }
        }

        datas = newArr;
    }

    /**
     * 此方法用于处理数据逆时针旋转
     */
    public void anticlockwise() {
        int[][] newArr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                newArr[3 - j][i] = datas[i][j];
            }
        }

        datas = newArr;
    }

    /**
     * 此方法键盘被按下时, 所触发的方法, 在这个方法中区分出上下左右按键
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == 37) {
            // 调用左移动的方法.
            moveToLeft();
            generatorNum();
        } else if (keyCode == 38) {
            // 上移动
            moveToTop();
            generatorNum();
        } else if (keyCode == 39) {
            // 调用右移动的方法
            moveToRight();
            generatorNum();
        } else if (keyCode == 40) {
            // 调用下移动的方法
            moveToBottom();
            generatorNum();
        }

        // 每一次移动的逻辑执行完, 都要去调用check方法, 检查游戏是否是失败的状态.
        check();

        // 每一次移动完成, 重新绘制界面
        paintView();
    }

    /**
     * 此方法用于处理数据下移动
     */
    public void moveToBottom() {
        // 1. 调用顺时针的方法
        clockwise();
        // 2. 左移
        moveToLeft();
        // 3. 调用逆时针的方法
        anticlockwise();
    }

    /**
     * 此方法用于处理数据上移动
     */
    public void moveToTop() {
        // 1. 调用逆时针旋转的方法
        anticlockwise();
        // 2. 左移动
        moveToLeft();
        // 3. 调用顺时针旋转的方法
        clockwise();
    }

    /**
     * 此方法用于处理右移动
     */
    public void moveToRight() {
        // 1. 反转数组
        horizontalSwap();
        // 2. 左移动
        moveToLeft();
        // 3. 反转数组
        horizontalSwap();

    }

    /**
     * 此方法在键盘被松开时候, 所触发的方法
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }

    /**
     * 此方法无法监听到上下左右按键, 无需关注
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * 此方法用于从空白的位置,  随机产生2号数字块.
     */
    public void generatorNum() {
        // 1. 创建两个数组, 准备记录二维数组中空白格子 i 和 j 的索引位置.
        int[] arrayI = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int[] arrayJ = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        int w = 0;

        // 2. 遍历二维数组, 取出每一个元素, 并判断当前元素是否是空白格式 (判断是否是0)
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if (datas[i][j] == 0) {
                    // 3. 是0的话, 将索引存入arrayI和arrayJ数组中.
                    arrayI[w] = i;
                    arrayJ[w] = j;
                    w++;
                }
            }
        }

        // 4. 如果w变量记录的不是0, 代表数组中还有空白的位置, 就可以产生新的数字方块.
        if (w != 0) {
            Random r = new Random();
            int index = r.nextInt(w);
            int x = arrayI[index];
            int y = arrayJ[index];
            datas[x][y] = 2;
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == item1) {
            theme = "A-";
        } else if (e.getSource() == item2) {
            theme = "B-";
        } else if (e.getSource() == item3) {
            theme = "C-";
        }

        // 重新绘制界面
        paintView();
    }
}
