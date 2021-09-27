package naicha;

import gongju.Commodity;
import gongju.ReadUser;
import gongju.User;
import gongju.Writeuser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 11:17
 */
public class zhucejianmian extends JFrame implements MouseListener {
    //创建用户名的文本输入框
    JTextField username = new JTextField();
    JTextField password = new JTextField();
    JTextField rePassword = new JTextField();
    JTextField Telephone = new JTextField();

    JButton submit = new JButton();
    JButton reset = new JButton();

    JDialog jDialog = new JDialog();
    //存的所有用户对象
    ArrayList<User> userList;
    ArrayList<String> usernameList=new ArrayList<>();
    ArrayList<Commodity> commoditys=new ArrayList<>();


    public zhucejianmian() {
    /*    this.userList = userList;
        this.usernameList = usernameList;
        this.commoditys = commoditys;*/

        //读取用户对象
        ReadUser readu =new ReadUser();
        //传参
        userList =readu.getusers();
        for (int i = 0; i < userList.size(); i++) {
            usernameList.add(userList.get(i).getUsername());
        }
        //对注册页面做一些基本设置
        initFrame();
        //添加组件
        initView();

        setVisible(true);
    }

    private void initView() {
        //标题栏图片
        Image logo = Toolkit.getDefaultToolkit().getImage("D:\\甜蜜蜜\\图片资料\\喜茶头像.png");
        setIconImage(logo);
        TrayIcon icon = new TrayIcon(logo);
        icon.setImageAutoSize(true);

        //添加注册用户名的文本
        JLabel usernameText = new JLabel(new ImageIcon("D:\\甜蜜蜜\\图片资料\\用户名.jpg"));
        usernameText.setBounds(178, 150, 80, 20);
        username.setBounds(280, 140, 200, 30);

        //添加注册电话的文本
        JLabel TelephoneText = new JLabel(new ImageIcon("D:\\甜蜜蜜\\图片资料\\电话.png"));
        TelephoneText.setBounds(178, 200, 80, 20);
        Telephone.setBounds(280, 195, 200, 30);

        //添加注册密码的文本
        JLabel passwordText = new JLabel(new ImageIcon("D:\\甜蜜蜜\\图片资料\\注册密码.jpg"));
        passwordText.setBounds(185, 250, 70, 20);
        password.setBounds(280, 247, 200, 30);

        //添加再次输入密码的文本
        JLabel rePasswordText = new JLabel(new ImageIcon("D:\\甜蜜蜜\\图片资料\\再次输入密码.jpg"));
        rePasswordText.setBounds(157, 307, 95, 20);
        rePassword.setBounds(280, 305, 200, 30);

        //确定的按钮
        submit.setIcon(new ImageIcon("D:\\甜蜜蜜\\图片资料\\确定.png"));
        submit.setBounds(220, 345, 90, 40);
        submit.addMouseListener(this);

        //重置的按钮
        reset.setIcon(new ImageIcon("D:\\甜蜜蜜\\图片资料\\重置.png"));
        reset.setBounds(341, 345, 90, 40);
        reset.addMouseListener(this);

        //背景图片
        JLabel backGround = new JLabel(new ImageIcon("D:\\甜蜜蜜\\图片资料\\背景2.png"));
        backGround.setBounds(0, 0, 648, 455);
        this.setTitle("注册");
        this.getContentPane().add(usernameText);
        this.getContentPane().add(passwordText);
        this.getContentPane().add(rePasswordText);
        this.getContentPane().add(TelephoneText);
        this.getContentPane().add(username);
        this.getContentPane().add(Telephone);
        this.getContentPane().add(password);
        this.getContentPane().add(rePassword);
        this.getContentPane().add(submit);
        this.getContentPane().add(reset);
        this.getContentPane().add(backGround);
    }

    public void initFrame() {
        setSize(665, 485);//大小
        setLocationRelativeTo(null);//居中
        setAlwaysOnTop(true);//置顶
        setLayout(null);//取消内部默认布局
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == submit) {
            //1.判断注册密码和再次输入注册密码，两个文本框的内容，是否一致。
            if (!password.getText().equals(rePassword.getText())) {
                showDialog("两次密码输入不一致");
                return; //当两次输入密码不一致时，结束程序，下面代码没必要运行
            }
            //当代码执行到这里时，可以保证两次输入的密码是一致的。
            if ("".equals(username.getText()) || "".equals(password.getText())) {
                showDialog("用户名或者密码为空");
                return;//如果用户名和密码为空，那么就没必要执行下面的代码了，直接弹框提示
            }
            //获取输入的用户名和密码
            //判断用户名是否存在。
            if (usernameList.contains(username.getText())) {
                //调用contains方法，判断当前注册的用户名是否存在
                // 如果方法的结果为true，表示已经存在，那么弹框提示
                showDialog("用户名已存在");
                return;//如果用户名已经存在，那么就没有必要执行下面的代码了
            }
            usernameList.add(username.getText());
            User user0 = new User();
            user0.setUsername(username.getText());
            user0.setPassword(password.getText());
            user0.setTelephone(Telephone.getText());
            user0.setIntegral(0);
            userList.add(user0);
            usernameList.add(username.getText());
            Writeuser wus = new Writeuser();
            try {
                wus.setZhuce(userList);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            this.setVisible(false);//把注册页面关闭
            showDialog("注册成功");
            new Denglujiemian();
        } else if (e.getSource() == reset) {
            //把三个文本输入框清空
            username.setText("");
            password.setText("");
            rePassword.setText("");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == submit) {
            submit.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\确定按下.png"));
        } else if (e.getSource() == reset) {
            reset.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\重置按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == submit) {
            submit.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\确定.png"));
        } else if (e.getSource() == reset) {
            reset.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\重置.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    //形参：表示当前弹框展示的内容
    public void showDialog(String content) {
        jDialog.setSize(200, 120);
        //居中
        jDialog.setLocationRelativeTo(null);
        //置顶
        jDialog.setAlwaysOnTop(true);
        //删除弹框中所有的内容
        jDialog.getContentPane().removeAll();
        //创建一个JLabel去编写文本内容
        JLabel jLabel = new JLabel(content);
        //把文本添加到弹框当中
        jDialog.add(jLabel);
        //把弹框展示出来
        jDialog.setVisible(true);
        // }
    }
}
