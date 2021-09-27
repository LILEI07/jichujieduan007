package naicha;

import gongju.Commodity;
import gongju.ReadCommodity;
import gongju.User;
import gongju.Writeuser;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

public class Xiugaiyonghu extends JFrame implements MouseListener {
    ArrayList<User> users;
    ArrayList<String> usersname;
    ArrayList<Commodity> commoditys = new ArrayList<>();
    JTextField usernametxt = new JTextField();
    JTextField passwordtxt = new JTextField();
    JTextField shoujihaotxt = new JTextField();
    JTextField quemimatxt = new JTextField();
    JTextField jiumimatxt = new JTextField();
    JButton queren = new JButton("确定修改");
    JDialog jDialog = new JDialog();
    //标记用户
    int number = -1;

    public Xiugaiyonghu(ArrayList<User> users, ArrayList<String> usersname, int number) {
        this.usersname = usersname;
        this.users = users;
        this.number = number;
        //对主界面进行设置
        //读取商品对象
        ReadCommodity readp =new ReadCommodity();
        //传参
        commoditys=readp.getcommoditys();
        initFrame();
        //在主界面中添加其他组件
        gai();
        setVisible(true);
    }

    // 设置新的用户名   密码
    public void gai() {
        JLabel usernameText = new JLabel("用户名：");
        usernameText.setBounds(116, 60, 70, 19);
        usernametxt.setBounds(195, 60, 200, 30);

        JLabel jiumimaText = new JLabel("旧密码：");
        jiumimaText.setBounds(116, 100, 70, 19);
        jiumimatxt.setBounds(195, 100, 200, 30);

        JLabel passwordText = new JLabel("新密码：");
        passwordText.setBounds(116, 140, 70, 19);
        passwordtxt.setBounds(195, 140, 200, 30);

        JLabel quemimaText = new JLabel("确认新密码：");
        quemimaText.setBounds(93, 180, 75, 19);
        quemimatxt.setBounds(195, 180, 200, 30);

        JLabel shoujihaoText = new JLabel("手机号：");
        shoujihaoText.setBounds(116, 220, 70, 19);
        shoujihaotxt.setBounds(195, 220, 200, 30);

        queren.setIcon(new ImageIcon(""));
        queren.setBounds(190, 300, 90, 40);
        queren.addMouseListener(this);
        queren.setContentAreaFilled(false);

        // 添加背景图片
        JLabel backGround = new JLabel(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\修改.png"));
        backGround.setBounds(0, 0, 470, 390);

        this.getContentPane().add(shoujihaoText);
        this.getContentPane().add(usernametxt);
        this.getContentPane().add(passwordtxt);
        this.getContentPane().add(shoujihaotxt);
        this.getContentPane().add(queren);
        this.getContentPane().add(usernameText);
        this.getContentPane().add(passwordText);
        this.getContentPane().add(quemimatxt);
        this.getContentPane().add(quemimaText);
        this.getContentPane().add(jiumimaText);
        this.getContentPane().add(jiumimatxt);
        this.getContentPane().add(backGround);
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

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == queren) {
            // 判断输入的用户名是否和当前用户匹配
            //  创建当前用户
            // 非空判断
            if ("".equals(usernametxt.getText()) && "".equals(passwordtxt.getText()) && "".equals(jiumimatxt.getText()) && "".equals(quemimatxt.getText()) && "".equals(shoujihaotxt.getText())) {
                showDialog("请输入全部信息，不修改则填入原来的信息");
                //&&passwordtxt.getText().equals(users.get(number).getPassword())
                //usernametxt.getText().equals(usersname.get(number))
            } else if (!quemimatxt.getText().equals(passwordtxt.getText())) {
                showDialog("新密码不相同，请确认密码");
            } else if (users.get(number).getPassword().equals(jiumimatxt.getText())) {
                //进行旧密码的验证，确保安全！
                //替换用户名列表
                usersname.set(number, usernametxt.getText());
                //把当前输入框中的用户名、新密码、电话存入对应的集合
                users.get(number).setUsername(usernametxt.getText());
                users.get(number).setPassword(passwordtxt.getText());
                users.get(number).setTelephone(shoujihaotxt.getText());
                //积分不做修改
                //修改本地文件
                Writeuser wus = new Writeuser();
                try {
                    wus.setZhuce(users);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                //提示修改成功！
                showDialog("用户信息修改成功！");
                //把当前的登录界面关闭
               // new Yonghuxinxi(users, usersname, commoditys,this.number);

                //进入主界面
                new ZhuJieMian(users, usersname, commoditys, number);
                this.setVisible(false);
            } else {
                //如果错误了，还需要给出弹框
                showDialog("旧密码错误");
            }
        }
    }

    public void showDialog(String content) {
        jDialog.setSize(100, 100);
        //居中
        jDialog.setLocationRelativeTo(null);
        //置顶
        jDialog.setAlwaysOnTop(true);
        //删除弹框中所有的内容
        jDialog.getContentPane().removeAll();
        JLabel jLabel = new JLabel(content);
        //把文本添加到弹框当中
        jDialog.add(jLabel);
        //把弹框展示出来
        jDialog.setVisible(true);
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
