package gongju;
/*@ClassName：Show_users
@date：2021/9/23 18:20
@作者：李磊
@Version：1.0
@Description：

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Show extends JFrame implements MouseListener {
    ArrayList<User> users;
    ArrayList<String> usersname = new ArrayList<>();
    ArrayList<Commodity> commoditys;
    JButton close = new JButton();

    public Show( int a) {

        ReadUser readu = new ReadUser();
        //传参
        users = readu.getusers();
        for (int i = 0; i < users.size(); i++) {
            usersname.add(users.get(i).getUsername());
        }
        //读取商品对象
        ReadCommodity readp = new ReadCommodity();
        //传参
        commoditys = readp.getcommoditys();



        if (a == 1) {
            jiemian("用户列表");
            initView1(users);
        } else if (a == 2) {
            jiemian("商品列表");
            initView2(commoditys);
        } else {
            System.out.println("show方法调用错误！");
        }
    }

    private void jiemian(String ss) {
        setTitle(ss);
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }

    private void initView1(ArrayList<User> users) {

        // 创建内容面板
        JPanel panel = new JPanel();
        // 表头（列名）
        String[] columnNames = {"uid", "用户名", "密码", "电话", "积分"};
        // 表格所有行数据
        Object[][] rowData = new Object[users.size()][5];
        int p = 1;
        for (int i = 0; i < rowData.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    rowData[i][j] = ("00" + p);
                    p++;
                } else if (j == 1) {
                    rowData[i][j] = users.get(i).getUsername();
                } else if (j == 2) {
                    rowData[i][j] = users.get(i).getPassword();
                } else if (j == 3) {
                    rowData[i][j] = "" + users.get(i).getTelephone();
                } else {
                    rowData[i][j] = "" + users.get(i).getIntegral();
                }
            }
        }
        // 创建一个表格，指定 表头 和 所有行数据
        JTable table = new JTable(rowData, columnNames);
        // 设置表格内容颜色
        table.setForeground(Color.BLACK);                   // 字体颜色
        table.setFont(new Font(null, Font.PLAIN, 14));      // 字体样式
        table.setSelectionForeground(Color.DARK_GRAY);      // 选中后字体颜色
        table.setSelectionBackground(Color.LIGHT_GRAY);     // 选中后字体背景
        table.setGridColor(Color.GRAY);                     // 网格颜色
        // 设置表头
        table.getTableHeader().setFont(new Font(null, Font.BOLD, 14));  // 设置表头名称字体样式
        table.getTableHeader().setForeground(Color.RED);                // 设置表头名称字体颜色
        table.getTableHeader().setResizingAllowed(false);               // 设置不允许手动改变列宽
        table.getTableHeader().setReorderingAllowed(false);             // 设置不允许拖动重新排序各列
        // 设置行高
        table.setRowHeight(30);
        // 第一列列宽设置为40
        table.getColumnModel().getColumn(0).setPreferredWidth(40);
        // 设置滚动面板视口大小（超过该大小的行数据，需要拖动滚动条才能看到）
        table.setPreferredScrollableViewportSize(new Dimension(510, 410));
        // 把 表格 放到 滚动面板 中（表头将自动添加到滚动面板顶部）
        JScrollPane scrollPane = new JScrollPane(table);
        // 添加 滚动面板 到 内容面板
        panel.add(scrollPane);
        close.setText("关闭窗口");
        close.setBounds(0, 0, 20, 20);
        close.addMouseListener(this);

        panel.add(close);


        // 设置 内容面板 到 窗口
        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);
    }

    private void initView2(ArrayList<Commodity> commoditys) {

        // 创建内容面板
        JPanel panel = new JPanel();
        // 表头（列名）
        String[] columnNames = {"序号", "商品名", "类型", "价格", "商品积分"};
        // 表格所有行数据
        Object[][] rowData = new Object[commoditys.size()][5];
        int p = 1;
        for (int i = 0; i < commoditys.size(); i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    rowData[i][j] = ("" + p);
                    p++;
                } else if (j == 1) {
                    rowData[i][j] = commoditys.get(i).getName();
                } else if (j == 2) {
                    rowData[i][j] = commoditys.get(i).getType();
                } else if (j == 3) {
                    rowData[i][j] = "" + commoditys.get(i).getPrice();
                } else {
                    rowData[i][j] = "" + commoditys.get(i).getIntegral();
                }
            }
        }
        // 创建一个表格，指定 表头 和 所有行数据
        JTable table = new JTable(rowData, columnNames);
        // 设置表格内容颜色
        table.setForeground(Color.BLACK);                   // 字体颜色
        table.setFont(new Font(null, Font.PLAIN, 14));      // 字体样式
        table.setSelectionForeground(Color.DARK_GRAY);      // 选中后字体颜色
        table.setSelectionBackground(Color.LIGHT_GRAY);     // 选中后字体背景
        table.setGridColor(Color.GRAY);                     // 网格颜色
        // 设置表头
        table.getTableHeader().setFont(new Font(null, Font.BOLD, 14));  // 设置表头名称字体样式
        table.getTableHeader().setForeground(Color.RED);                // 设置表头名称字体颜色
        table.getTableHeader().setResizingAllowed(false);               // 设置不允许手动改变列宽
        table.getTableHeader().setReorderingAllowed(false);             // 设置不允许拖动重新排序各列
        // 设置行高
        table.setRowHeight(30);
        // 第一列列宽设置为40
        table.getColumnModel().getColumn(0).setPreferredWidth(40);
        // 设置滚动面板视口大小（超过该大小的行数据，需要拖动滚动条才能看到）
        table.setPreferredScrollableViewportSize(new Dimension(510, 410));
        // 把 表格 放到 滚动面板 中（表头将自动添加到滚动面板顶部）
        JScrollPane scrollPane = new JScrollPane(table);
        // 添加 滚动面板 到 内容面板
        panel.add(scrollPane);
        // 设置 内容面板 到 窗口
        panel.add(scrollPane);
        close.setText("关闭窗口");
        close.setBounds(0, 0, 20, 20);
        close.addMouseListener(this);

        panel.add(close);
        this.setContentPane(panel);
        this.pack();
       //    this.setLocationRelativeTo(null);
        this.setVisible(true);
       //this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==close){
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

