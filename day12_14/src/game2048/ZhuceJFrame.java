package game2048;
/*@ClassName：zhuceJFrame
@date：2021/9/18 19:06
@作者：李磊
@Version：1.0
@Description：

*/

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ZhuceJFrame  extends JFrame implements MouseListener {
    JTextField zhuceusername = new JTextField();
    JTextField zhucepassword = new JTextField();
    JTextField rezhucepassword = new JTextField();

    JButton queding = new JButton();
    JButton chongzhi = new JButton();
    JDialog tankuang = new JDialog();
    ArrayList<User> users;
    ArrayList<String> usersname;

    public ZhuceJFrame(ArrayList<User> users, ArrayList<String> usersname) {
        this.users = users;
        this.usersname = usersname;
        jiemian("注册");
        initView();
        setVisible(true);
    }

    public void initView() {
        //用户名提示文本
        JLabel zhuceusernametxt = new JLabel(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\注册用户名.jpg"));
        zhuceusernametxt.setBounds(80, 135, 82, 20);
        zhuceusername.setBounds(190, 130, 230, 30);
        //密码提示文本
        JLabel zhucepasswordtxt = new JLabel(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\注册密码.jpg"));
        zhucepasswordtxt.setBounds(95, 190, 66, 20);
        zhucepassword.setBounds(190, 190, 230, 30);

        //确认密码提示文本
        JLabel rezhucepasswordtxt = new JLabel(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\再次输入密码.jpg"));
        rezhucepasswordtxt.setBounds(65, 250, 100, 20);
        rezhucepassword.setBounds(190, 245, 230, 30);

        //背景图片
        JLabel beijing = new JLabel(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\background.png"));
        beijing.setBounds(0, 0, 470, 390);

        //确定按钮
        queding.setIcon(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\确定.png"));
        queding.setBounds(135, 305, 100, 40);
        queding.addMouseListener(this);

        //重置按钮
        chongzhi.setIcon(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\重置.png"));
        chongzhi.setBounds(255, 305, 100, 40);
        chongzhi.addMouseListener(this);

        //添加组件
        this.getContentPane().add(zhuceusernametxt);
        this.getContentPane().add(zhuceusername);
        this.getContentPane().add(zhucepasswordtxt);
        this.getContentPane().add(zhucepassword);
        this.getContentPane().add(rezhucepasswordtxt);
        this.getContentPane().add(rezhucepassword);
        this.getContentPane().add(queding);
        this.getContentPane().add(chongzhi);
        this.getContentPane().add(beijing);
    }

    private void jiemian(String ss) {
        setTitle(ss);
        setSize(485, 428);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }

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

    @Override
    public void mouseClicked(MouseEvent e) {
        //鼠标点击
        //点击重置按钮，清除三个输入框的所有内容；
        if (e.getSource() == chongzhi) {
            zhuceusername.setText("");
            zhucepassword.setText("");
            rezhucepassword.setText("");
        } else if (e.getSource() == queding) {
            //获取三个文本框的内容；
            //判断密码是否一致
            if (!zhucepassword.getText().equals(rezhucepassword.getText())) {
                //弹框提示密码不一致！
                showtankuang("密码不一致，请修正！");
            } else if ("".equals(zhuceusername.getText()) || "".equals(zhucepassword.getText())) {
                showtankuang("用户名或者密码为空！");
            } else if (usersname.contains(zhuceusername.getText())) {
                showtankuang("用户名被占用，请重新输入！");
            }else{
                //添加元素到集合；
                usersname.add(zhuceusername.getText());
                users.add(new User(zhuceusername.getText(),zhucepassword.getText()));
                showtankuang("注册成功！");
                try {
                    setZhuce(zhuceusername.getText(),zhucepassword.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                setVisible(false);
            }
        }
    }

    private void setZhuce(String name,String password) throws IOException {
        FileWriter fw = new FileWriter("E:\\develop\\素材\\2048\\2048登录注册\\用户名单.txt",true);
       // fw.write("\n");
        fw.write(name+","+password);
        fw.write("\n");
        //刷新
        fw.flush();
        //关闭流
        fw.close();
    }


    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == queding) {
            queding.setIcon(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\确定按下.png"));
        } else if (e.getSource() == chongzhi) {
            chongzhi.setIcon(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\重置按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == queding) {
            queding.setIcon(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\确定.png"));
        } else if (e.getSource() == chongzhi) {
            chongzhi.setIcon(new ImageIcon("E:\\develop\\素材\\2048\\2048登录注册\\重置.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
