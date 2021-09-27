package naicha;

import gongju.Commodity;
import gongju.User;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Yonghuxinxi extends JFrame implements MouseListener {
    ArrayList<User> users;
    ArrayList<String> usersname;
    ArrayList<Commodity> commoditys;
    JTextField username = new JTextField();
    JTextField password = new JTextField();
    JButton login = new JButton("修改用户");
    JButton zhuxiao = new JButton("注销用户");
    JTextField shoujihao = new JTextField();
    JTextField jifen = new JTextField();
    JButton tuichu = new JButton("返回点餐");
    //标记用户
    int number = -1;

    public Yonghuxinxi(ArrayList<User> users, ArrayList<String> usersname, ArrayList<Commodity> commoditys, int number) {
        this.usersname = usersname;
        this.users = users;
        this.commoditys = commoditys;
        this.number = number;
        //对主界面进行设置
        initFrame();
        //在主界面中添加其他组件
        nameword();
        setVisible(true);
    }

    // 调用用户名   密码
    public void nameword() {
        JLabel usernameText = new JLabel("用户名："+users.get(number).getUsername());
        usernameText.setBounds(150, 60, 200, 20);

        JLabel passwordText = new JLabel("密码："+users.get(number).getPassword());
        passwordText.setBounds(160, 100, 200, 20);

        JLabel shoujihaoText = new JLabel("手机号："+users.get(number).getTelephone());
        shoujihaoText.setBounds(146, 140, 200, 20);

        JLabel jifenText = new JLabel("积分："+users.get(number).getIntegral());
        jifenText.setBounds(160, 180, 200, 20);

        login.setIcon(new ImageIcon(""));
        login.setBounds(85, 260, 90, 40);
        login.setContentAreaFilled(false);
        //给登录按钮绑定鼠标监听
        //当事件被触发之后，执行当前类中的对应方法
        login.addMouseListener(this);

        zhuxiao.setIcon(new ImageIcon(""));
        zhuxiao.setBounds(185, 260, 90, 40);
        zhuxiao.addMouseListener(this);
        zhuxiao.setContentAreaFilled(false);

        tuichu.setIcon(new ImageIcon(""));
        tuichu.setBounds(285, 260, 90, 40);
        tuichu.addMouseListener(this);
        tuichu.setContentAreaFilled(false);

        // 背景图片
        JLabel backGround = new JLabel(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\主.jpg"));
        backGround.setBounds(0, 0, 470, 390);

        //给注册按钮绑定鼠标事件，当事件被触发，执行当前类的对应的方法

        this.getContentPane().add(usernameText);
        this.getContentPane().add(passwordText);
        this.getContentPane().add(shoujihaoText);
        this.getContentPane().add(jifenText);
        this.getContentPane().add(login);
        this.getContentPane().add(zhuxiao);
        this.getContentPane().add(backGround);
        this.getContentPane().add(tuichu);
    }

    public void initFrame() {
        //大小
        setSize(485, 428);
        //居中
        setLocationRelativeTo(null);
        //置顶
        setAlwaysOnTop(true);
        //关闭模式
        setDefaultCloseOperation(3);
        //取消内部默认布局
        setLayout(null);
    }

    //  按下放开
    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == login) {
            new Xiugaiyonghu(users, usersname, number);
            this.setVisible(false);
        }
        if (e.getSource() == zhuxiao) {
            new Zhuxiaoyonghu(users, usersname, number);
            this.setVisible(false);
        }
        if (e.getSource() == tuichu) {
            new ZhuJieMian(users,usersname,commoditys,number);
            this.setVisible(false);

        }

    }

    // 按下
    @Override
    public void mousePressed(MouseEvent e) {

    }

    // 松开
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
