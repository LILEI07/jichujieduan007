package naicha;

import gongju.Commodity;
import gongju.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ZhuJieMian extends JFrame implements MouseListener {
    JButton shangpin = new JButton("商品橱窗");
    JButton dingdan = new JButton("切换账户");
    JButton wode = new JButton("我的信息");

    JButton naicha = new JButton("奶茶系列");
    JButton naicha1 = new JButton("芝芝嫩芽");
    JButton naicha2 = new JButton("纯碎银子");
    JButton naicha3 = new JButton("酒酿桂花冻");

    JButton guocha = new JButton("果茶系列");
    JButton guocha1 = new JButton("冰山杨梅");
    JButton guocha2 = new JButton("思想龙眼");
    JButton guocha3 = new JButton("杨枝甘露");

    JButton kafei = new JButton("咖啡系列");
    JButton kafei1 = new JButton("冷萃美式");
    JButton kafei2 = new JButton("椰椰美式");
    JButton kafei3 = new JButton("椰子拿铁");
    //定义标签类
    JLabel naicha01 = new JLabel();
    JLabel naicha02 = new JLabel();
    JLabel naicha03 = new JLabel();
    JLabel guocha01 = new JLabel();
    JLabel guocha02 = new JLabel();
    JLabel guocha03 = new JLabel();
    JLabel kafei01 = new JLabel();
    JLabel kafei02 = new JLabel();
    JLabel kafei03 = new JLabel();
    /*   JLabel oubao = new JLabel("欧包系列");
       JButton oubao1 = new JButton("欧包1");
       JButton oubao2 = new JButton("欧包2");
       JButton oubao3 = new JButton("欧包3");
   */
    ArrayList<User> users;
    ArrayList<String> usersname;
    ArrayList<Commodity> commoditys;
    //标记用户，区别不同的用户
    int number = -1;
    //标记当前界面的不同商品按钮
    int p = -1;

    public ZhuJieMian(ArrayList<User> users, ArrayList<String> usersname, ArrayList<Commodity> commoditys, int number) {
        this.users = users;
        this.usersname = usersname;
        this.commoditys = commoditys;
        this.number = number;
        setTitle(usersname.get(number) + "的点餐台");
        initFrame();
        initView();
        setVisible(true);
    }

    private void initView() {
        //添加三个主按钮
        shangpin.setBounds(20, 40, 90, 35);
        shangpin.setFont(new Font("黑体", 14, 20));
        dingdan.setBounds(20, 300, 90, 35);
        dingdan.setFont(new Font("黑体", 14, 20));
        //点餐按钮添加鼠标监听器
        dingdan.addMouseListener(this);
        wode.setBounds(20, 550, 90, 35);
        wode.setFont(new Font("黑体", 14, 20));
        wode.addMouseListener(this);
        //添加系列按钮
        naicha.setBounds(140, 40, 90, 25);
        naicha.setFont(new Font("黑体", 14, 16));
        guocha.setBounds(140, 240, 90, 25);
        guocha.setFont(new Font("黑体", 14, 16));
        kafei.setBounds(140, 440, 90, 25);
        kafei.setFont(new Font("黑体", 14, 16));
        //添加饮品1按钮
        naicha1.setBounds(300, 40, 100, 20);
        naicha1.setFont(new Font("黑体", 14, 14));
        naicha1.addMouseListener(this);
        guocha1.setBounds(300, 240, 100, 20);
        guocha1.setFont(new Font("黑体", 14, 14));
        guocha1.addMouseListener(this);
        kafei1.setBounds(300, 440, 100, 20);
        kafei1.setFont(new Font("黑体", 14, 14));
        kafei1.addMouseListener(this);
        //添加饮品2按钮
        naicha2.setBounds(450, 40, 100, 20);
        naicha2.setFont(new Font("黑体", 14, 14));
        naicha2.addMouseListener(this);
        guocha2.setBounds(450, 240, 100, 20);
        guocha2.setFont(new Font("黑体", 14, 14));
        guocha2.addMouseListener(this);
        kafei2.setBounds(450, 440, 100, 20);
        kafei2.setFont(new Font("黑体", 14, 14));
        kafei2.addMouseListener(this);
        //添加饮品3按钮
        naicha3.setBounds(600, 40, 150, 20);
        naicha3.setFont(new Font("黑体", 14, 14));
        naicha3.addMouseListener(this);
        guocha3.setBounds(600, 240, 150, 20);
        guocha3.setFont(new Font("黑体", 14, 14));
        guocha3.addMouseListener(this);
        kafei3.setBounds(600, 440, 150, 20);
        kafei3.setFont(new Font("黑体", 14, 14));
        kafei3.addMouseListener(this);
        //添加背景图片
        JLabel backGround = new JLabel(new ImageIcon("D:\\甜蜜蜜\\图片资料\\主页面背景图.png"));
        backGround.setBounds(0, 0, 769, 726);

        //按钮背景透明度
        shangpin.setBorderPainted(false);
        shangpin.setBorder(null);
        shangpin.setContentAreaFilled(false);

        dingdan.setBorderPainted(false);
        dingdan.setBorder(null);
        dingdan.setContentAreaFilled(false);

        wode.setBorderPainted(false);
        wode.setBorder(null);
        wode.setContentAreaFilled(false);

        naicha.setBorderPainted(false);
        naicha.setBorder(null);
        naicha.setContentAreaFilled(false);

        guocha.setBorderPainted(false);
        guocha.setBorder(null);
        guocha.setContentAreaFilled(false);

        kafei.setBorderPainted(false);
        kafei.setBorder(null);
        kafei.setContentAreaFilled(false);

        naicha1.setBorderPainted(false);
        naicha1.setBorder(null);
        naicha1.setContentAreaFilled(false);

        naicha2.setBorderPainted(false);
        naicha2.setBorder(null);
        naicha2.setContentAreaFilled(false);

        naicha3.setBorderPainted(false);
        naicha3.setBorder(null);
        naicha3.setContentAreaFilled(false);

        guocha1.setBorderPainted(false);
        guocha1.setBorder(null);
        guocha1.setContentAreaFilled(false);

        guocha2.setBorderPainted(false);
        guocha2.setBorder(null);
        guocha2.setContentAreaFilled(false);

        guocha3.setBorderPainted(false);
        guocha3.setBorder(null);
        guocha3.setContentAreaFilled(false);

        kafei1.setBorderPainted(false);
        kafei1.setBorder(null);
        kafei1.setContentAreaFilled(false);

        kafei2.setBorderPainted(false);
        kafei2.setBorder(null);
        kafei2.setContentAreaFilled(false);

        kafei3.setBorderPainted(false);
        kafei3.setBorder(null);
        kafei3.setContentAreaFilled(false);
        this.getContentPane().add(shangpin);

        //设置标签类
        naicha01.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\芝芝嫩芽.png"));
        naicha01.setBounds(280, 70, 130, 160);
        naicha02.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\纯碎银子.png"));
        naicha02.setBounds(430, 70, 130, 160);
        naicha03.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\酒酿桂花冻.png"));
        naicha03.setBounds(590, 70, 130, 160);
        naicha01.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\芝芝嫩芽.png"));
        naicha01.setBounds(280, 70, 130, 160);

        guocha01.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\冰山杨梅.png"));
        guocha01.setBounds(280, 270, 130, 160);
        guocha02.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\思乡龙眼.png"));
        guocha02.setBounds(430, 270, 130, 160);
        guocha03.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\杨枝甘露.png"));
        guocha03.setBounds(590, 270, 130, 160);
        kafei01.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\冷萃美式.png"));
        kafei01.setBounds(280, 480, 130, 160);
        kafei02.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\椰椰美式.png"));
        kafei02.setBounds(430, 480, 130, 160);
        kafei03.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\椰子拿铁.png"));
        kafei03.setBounds(590, 480, 130, 160);

        this.getContentPane().add(dingdan);
        this.getContentPane().add(kafei03);
        this.getContentPane().add(kafei02);
        this.getContentPane().add(kafei01);
        this.getContentPane().add(guocha03);
        this.getContentPane().add(guocha02);
        this.getContentPane().add(guocha01);
        this.getContentPane().add(naicha03);
        this.getContentPane().add(naicha02);
        this.getContentPane().add(naicha01);

        this.getContentPane().add(wode);
        this.getContentPane().add(naicha);
        this.getContentPane().add(guocha);
        this.getContentPane().add(kafei);
        this.getContentPane().add(naicha1);
        this.getContentPane().add(guocha1);
        this.getContentPane().add(kafei1);
        this.getContentPane().add(naicha2);
        this.getContentPane().add(guocha2);
        this.getContentPane().add(kafei2);
        this.getContentPane().add(naicha3);
        this.getContentPane().add(guocha3);
        this.getContentPane().add(kafei3);
        this.getContentPane().add(backGround);

    }

    public void initFrame() {
        //窗口大小
        setSize(750, 700);
        //窗口居中
        setLocationRelativeTo(null);
        //置顶
        setAlwaysOnTop(true);
        //关闭模式
        setDefaultCloseOperation(3);
        //取消内部默认布局
        setLayout(null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == dingdan) {
            new Denglujiemian();
            this.setVisible(false);
        }
        if (e.getSource() == wode) {
            new Yonghuxinxi(users, usersname, commoditys, this.number);
            this.setVisible(false);
        }
        if (e.getSource() == naicha1) {
            p = 0;
            new Naicha(p, number);
            this.setVisible(false);
        }
        if (e.getSource() == naicha2) {
            p = 1;
            new Naicha(p, number);
            this.setVisible(false);
        }
        if (e.getSource() == naicha3) {
            p = 2;
            new Naicha(p, number);
            this.setVisible(false);
        }
        if (e.getSource() == guocha1) {
            p = 3;
            new Guocha(p, number);
            this.setVisible(false);
        }
        if (e.getSource() == guocha2) {
            p = 4;
            new Guocha(p, number);
            this.setVisible(false);
        }
        if (e.getSource() == guocha3) {
            p = 5;
            new Guocha(p, number);
            this.setVisible(false);
        }
        if (e.getSource() == kafei1) {
            p = 6;
            new Kafei(p, number);
            this.setVisible(false);
        }
        if (e.getSource() == kafei2) {
            p = 7;
            new Kafei(p, number);
            this.setVisible(false);
        }
        if (e.getSource() == kafei3) {
            p = 8;
            new Kafei(p, number);
            this.setVisible(false);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
