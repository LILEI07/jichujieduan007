package naicha;
/*@ClassName：guanliyuanjiemian
@date：2021/9/23 11:27
@作者：李磊
@Version：1.0
@Description：

*/

import gongju.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Guanliyuanjiemian extends JFrame implements MouseListener {
    ArrayList<User> users;
    ArrayList<String> usersname = new ArrayList<>();
    ArrayList<Commodity> commoditys;

    JButton lookuser = new JButton("查看用户");
    JButton removeuser = new JButton("删除用户");
    JButton adduser = new JButton("添加用户");
    JButton xiugaiyonghu = new JButton("修改用户");
    JButton addshangpin = new JButton("添加商品");
    JButton removeshangpin = new JButton("删除商品");
    JButton xiugaishangpin = new JButton("修改商品");
    JButton lookshangpin = new JButton("查看商品");
    JButton denglu = new JButton("返回用户登录");
    // JDialog tishi = new JDialog();


    public Guanliyuanjiemian() {

        //读取用户对象
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
        jiemian("管理员界面");
        //添加插件
        initView();
        setVisible(true);
    }

    private void initView() {
        JLabel yonghu = new JLabel("用户管理");
        yonghu.setFont(new Font("黑体", 5, 25));
        yonghu.setBounds(170, 45, 390, 80);

        JLabel shangpin = new JLabel("商品管理");
        shangpin.setFont(new Font("黑体", 6, 25));
        shangpin.setBounds(670, 45, 390, 80);

        lookuser.setBounds(100, 200, 260, 50);
        lookuser.setFont(new Font("宋体", 5, 20));
        lookuser.addMouseListener(this);

        xiugaiyonghu.setBounds(100, 350, 260, 50);
        xiugaiyonghu.setFont(new Font("宋体", 5, 20));
        xiugaiyonghu.addMouseListener(this);

        adduser.setBounds(100, 500, 260, 50);
        adduser.setFont(new Font("宋体", 5, 20));
        adduser.addMouseListener(this);

        removeuser.setBounds(100, 650, 260, 50);
        removeuser.setFont(new Font("宋体", 5, 20));
        removeuser.addMouseListener(this);

        lookshangpin.setBounds(600, 200, 260, 50);
        lookshangpin.setFont(new Font("宋体", 6, 20));
        lookshangpin.addMouseListener(this);

        xiugaishangpin.setBounds(600, 350, 260, 50);
        xiugaishangpin.setFont(new Font("宋体", 6, 20));
        xiugaishangpin.addMouseListener(this);

        addshangpin.setBounds(600, 500, 260, 50);
        addshangpin.setFont(new Font("宋体", 6, 20));
        addshangpin.addMouseListener(this);

        removeshangpin.setBounds(600, 650, 260, 50);
        removeshangpin.setFont(new Font("宋体", 6, 20));
        removeshangpin.addMouseListener(this);


        denglu.setBounds(360, 25, 260, 50);
        denglu.setFont(new Font("宋体", 10, 30));
        denglu.addMouseListener(this);

        this.getContentPane().add(yonghu);
        this.getContentPane().add(shangpin);
        this.getContentPane().add(denglu);
        this.getContentPane().add(lookuser);
        this.getContentPane().add(xiugaiyonghu);
        this.getContentPane().add(adduser);
        this.getContentPane().add(removeuser);
        this.getContentPane().add(lookshangpin);
        this.getContentPane().add(xiugaishangpin);
        this.getContentPane().add(addshangpin);
        this.getContentPane().add(removeshangpin);
    }

    private void jiemian(String ss) {
        setTitle(ss);
        setSize(1000, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == denglu) {
            //展示所有用户
            this.setVisible(false);
            new Denglujiemian();
        }

        if (e.getSource() == lookuser) {
            //展示所有用户
            new Show( 1);
        }
        if (e.getSource() == xiugaiyonghu) {
            //修改用户信息
            new Dodata(2);
            this.setVisible(false);
        }
        if (e.getSource() == adduser) {
            //添加用户
            new Dodata(3);
            this.setVisible(false);
        }
        if (e.getSource() == removeuser) {
            //删除用户
            new Dodata(4);
            this.setVisible(false);
        }
        if (e.getSource() == lookshangpin) {
            //展示所有商品
            new Show(2);
        }
        if (e.getSource() == xiugaishangpin) {
            //修改商品参数
            new Dodata(6);
            this.setVisible(false);
        }
        if (e.getSource() == addshangpin) {
            //添加商品
            new Dodata(7);
            this.setVisible(false);
        }
        if (e.getSource() == removeshangpin) {
            //移除商品
            new Dodata(8);
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
