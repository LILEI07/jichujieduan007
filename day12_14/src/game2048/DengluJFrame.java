package game2048;
/*@ClassName：MyJFrame
@date：2021/9/18 10:37
@作者：李磊
@Version：1.0
@Description：
*/

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class DengluJFrame extends JFrame implements MouseListener {
    JTextField username = new JTextField();
    JTextField password = new JTextField();
    JButton denglu = new JButton();
    JButton zhuce = new JButton();
    JDialog tankuang = new JDialog();
    ArrayList<User> users;
    ArrayList<String> usersname;

    public DengluJFrame(ArrayList<User> users, ArrayList<String> usersname) {
        this.users = users;
        this.usersname = usersname;
        jiemian("登录");
        initView();
        setVisible(true);
    }

    public void initView() {
        //用户名提示文本
        JLabel usernametxt = new JLabel(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\用户名.jpg"));
        usernametxt.setBounds(95, 155, 51, 19);
        username.setBounds(170, 150, 230, 30);
        //密码提示文本
        JLabel passwordtxt = new JLabel(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\密码.jpg"));
        passwordtxt.setBounds(95, 225, 35, 18);
        password.setBounds(170, 220, 230, 30);
        //背景图片
        JLabel beijing = new JLabel(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\background.png"));
        beijing.setBounds(0, 0, 470, 390);
        //登录按钮
        denglu.setIcon(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\登录.png"));
        denglu.setBounds(135, 305, 100, 40);
        denglu.addMouseListener(this);
        //注册按钮
        zhuce.setIcon(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\注册.png"));
        zhuce.setBounds(255, 305, 100, 40);
        zhuce.addMouseListener(this);

        //添加组件
        this.getContentPane().add(denglu);
        this.getContentPane().add(zhuce);
        this.getContentPane().add(usernametxt);
        this.getContentPane().add(username);
        this.getContentPane().add(passwordtxt);
        this.getContentPane().add(password);
        this.getContentPane().add(beijing);
    }


    //抽取方法，设置登录界面
    private void jiemian(String ss) {
        setTitle(ss);
        setSize(485, 428);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }

    @Override
    //鼠标监听器
    //点击
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == denglu) {
            //验证用户名和密码
            //用户名和密码为空
            if ("".equals(username.getText()) || "".equals(password.getText())) {
                showtankuang("用户名或者密码为空");
            } else if (users.contains(new User(username.getText(), password.getText()))) {
                //关闭当前界面
                this.setVisible(false);
                //展示游戏界面
                new MainFrame();
            } else {
                showtankuang("用户名或者密码错误！");
            }
        } else {
            new ZhuceJFrame(users, usersname);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
//按下
        if (e.getSource() == denglu) {
            denglu.setIcon(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\登录按下.png"));
        } else {
            zhuce.setIcon(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\登录按下.png"));
        }
    }

    @Override
    //松开
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == denglu) {
            denglu.setIcon(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\登录.png"));
        } else {
            zhuce.setIcon(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\注册.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }


    //弹框方法，展示文本！
    public void showtankuang(String ss) {
        //判断弹框是否展示，否，则展示！
        if (!tankuang.isVisible()) {
            //设置弹框宽度
            tankuang.setSize(200, 100);
            //居中
            tankuang.setLocationRelativeTo(null);
            //移除框内所有内容
            tankuang.getContentPane().removeAll();
            //置顶
            tankuang.setAlwaysOnTop(true);
            //设置文本框
            JLabel tishi = new JLabel(ss);
            //添加组件到弹框
            tankuang.add(tishi);
            //展示所有组件
            tankuang.setVisible(true);
        }
    }
}
