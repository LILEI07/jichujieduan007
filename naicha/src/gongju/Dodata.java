package gongju;
/*@ClassName：Dodata
@date：2021/9/24 20:23
@作者：李磊
@Version：1.0
@Description：

*/

import naicha.Guanliyuanjiemian;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

public class Dodata extends JFrame implements MouseListener {
    ArrayList<User> users;
    ArrayList<String> usersname = new ArrayList<>();
    ArrayList<Commodity> commoditys;
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextField txt3 = new JTextField();
    JTextField txt4 = new JTextField();
    JTextField txt5 = new JTextField();
    JTextField txt6 = new JTextField();
    JButton queren = new JButton("提交");
    JDialog jDialog = new JDialog();
    int p = -1;//代表不同的操作（增删改查）

    public Dodata(int p) {
        this.p = p;
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

        //添加插件
        initView(p);
        setVisible(true);
    }

    private void initView(int p) {
        if (p == 2) {
            jiemian("修改用户");
            JLabel s5 = new JLabel("请输入要修改用户的UID");
            s5.setBounds(100, 20, 150, 30);
            txt5.setBounds(250, 20, 150, 30);
            JLabel s1 = new JLabel("请修改用户名：");
            s1.setBounds(100, 70, 150, 30);
            txt1.setBounds(250, 70, 150, 30);
            JLabel s2 = new JLabel("请修改密码");
            s2.setBounds(100, 125, 150, 30);
            txt2.setBounds(250, 125, 150, 30);
            JLabel s3 = new JLabel("请修改电话号码");
            s3.setBounds(100, 190, 150, 30);
            txt3.setBounds(250, 190, 150, 30);
            JLabel s4 = new JLabel("请修改积分");
            s4.setBounds(100, 250, 150, 30);
            txt4.setBounds(250, 250, 150, 30);
            queren.setBounds(210, 300, 60, 30);


            queren.addMouseListener(this);
            this.getContentPane().add(queren);
            this.getContentPane().add(s1);
            this.getContentPane().add(s2);
            this.getContentPane().add(s3);
            this.getContentPane().add(s4);
            this.getContentPane().add(s5);
            this.getContentPane().add(txt1);
            this.getContentPane().add(txt2);
            this.getContentPane().add(txt3);
            this.getContentPane().add(txt4);
            this.getContentPane().add(txt5);

        } else if (p == 3) {
            jiemian("添加用户");

            JLabel s1 = new JLabel("请设置用户名：");
            s1.setBounds(100, 20, 150, 30);
            txt1.setBounds(250, 20, 150, 30);
            JLabel s2 = new JLabel("请设置密码");
            s2.setBounds(100, 70, 150, 30);
            txt2.setBounds(250, 70, 150, 30);
            JLabel s3 = new JLabel("请设置电话号码");
            s3.setBounds(100, 130, 150, 30);
            txt3.setBounds(250, 130, 150, 30);
            JLabel s4 = new JLabel("请设置积分");
            s4.setBounds(100, 200, 150, 30);
            txt4.setBounds(250, 200, 150, 30);
            queren.setBounds(210, 270, 60, 30);
            queren.addMouseListener(this);
            this.getContentPane().add(queren);
            this.getContentPane().add(s1);
            this.getContentPane().add(s2);
            this.getContentPane().add(s3);
            this.getContentPane().add(s4);
            this.getContentPane().add(txt1);
            this.getContentPane().add(txt2);
            this.getContentPane().add(txt3);
            this.getContentPane().add(txt4);

        } else if (p == 4) {
            jiemian("删除用户");
            JLabel s1 = new JLabel("请输入要删除用户的UID");
            s1.setBounds(150, 80, 150, 30);
            txt1.setBounds(150, 160, 150, 30);

            this.getContentPane().add(s1);
            this.getContentPane().add(txt1);
            queren.setBounds(210, 240, 60, 30);
            queren.addMouseListener(this);
            this.getContentPane().add(queren);

        } else if (p == 6) {
            jiemian("修改商品");
            JLabel s5 = new JLabel("请输入要修改商品的序号");
            s5.setBounds(100, 20, 150, 30);
            txt5.setBounds(250, 20, 150, 30);

            JLabel s1 = new JLabel("请修改商品名：");
            s1.setBounds(100, 70, 150, 30);
            txt1.setBounds(250, 70, 150, 30);
            JLabel s2 = new JLabel("请修改商品类型");
            s2.setBounds(100, 125, 150, 30);
            txt2.setBounds(250, 125, 150, 30);
            JLabel s3 = new JLabel("请修改商品价格");
            s3.setBounds(100, 190, 150, 30);
            txt3.setBounds(250, 190, 150, 30);
            JLabel s4 = new JLabel("请修改商品积分");
            s4.setBounds(100, 250, 150, 30);
            txt4.setBounds(250, 250, 150, 30);
            queren.setBounds(210, 300, 60, 30);


            queren.addMouseListener(this);
            this.getContentPane().add(queren);
            this.getContentPane().add(s1);
            this.getContentPane().add(s2);
            this.getContentPane().add(s3);
            this.getContentPane().add(s4);
            this.getContentPane().add(s5);
            this.getContentPane().add(txt1);
            this.getContentPane().add(txt2);
            this.getContentPane().add(txt3);
            this.getContentPane().add(txt4);
            this.getContentPane().add(txt5);

        } else if (p == 7) {
            jiemian("添加商品");

            JLabel s1 = new JLabel("请设置是商品名：");
            s1.setBounds(100, 20, 150, 30);
            txt1.setBounds(250, 20, 150, 30);
            JLabel s2 = new JLabel("请设置商品类型");
            s2.setBounds(100, 70, 150, 30);
            txt2.setBounds(250, 70, 150, 30);
            JLabel s3 = new JLabel("请设置商品价格");
            s3.setBounds(100, 130, 150, 30);
            txt3.setBounds(250, 130, 150, 30);
            JLabel s4 = new JLabel("请设置商品积分");
            s4.setBounds(100, 200, 150, 30);
            txt4.setBounds(250, 200, 150, 30);
            queren.setBounds(210, 270, 60, 30);
            queren.addMouseListener(this);
            this.getContentPane().add(queren);
            this.getContentPane().add(s1);
            this.getContentPane().add(s2);
            this.getContentPane().add(s3);
            this.getContentPane().add(s4);
            this.getContentPane().add(txt1);
            this.getContentPane().add(txt2);
            this.getContentPane().add(txt3);
            this.getContentPane().add(txt4);
        } else if (p == 8) {
            jiemian("删除商品");

            JLabel s1 = new JLabel("请输入要删除商品的序号");
            s1.setBounds(150, 80, 150, 30);
            txt1.setBounds(150, 160, 150, 30);

            this.getContentPane().add(s1);
            this.getContentPane().add(txt1);
            queren.setBounds(210, 240, 60, 30);
            queren.addMouseListener(this);
            this.getContentPane().add(queren);
        } else {
            System.out.println("界面调用参数错误");
        }
   /*     JLabel yonghu = new JLabel("用户管理");
        yonghu.setFont(new Font("黑体", 5, 25));
        yonghu.setBounds(170, 45, 390, 80);

        JLabel passwordText = new JLabel("新密码：");

        this.getContentPane().add(yonghu);*/

    }

    private void jiemian(String ss) {
        setTitle(ss);
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == queren) {

            if (p == 2) {
                User S0 = new User(txt1.getText(), txt2.getText(), txt3.getText(), Integer.parseInt(txt4.getText()));
                users.set(Integer.parseInt(txt5.getText())-1,S0);
                Writeuser wus = new Writeuser();
                try {
                    wus.setZhuce(users);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                setVisible(false);
                showDialog("修改用户成功");
                new Guanliyuanjiemian();
            }

            if (p == 3) {
                User S0 = new User(txt1.getText(), txt2.getText(), txt3.getText(), Integer.parseInt(txt4.getText()));
                users.add(S0);
                Writeuser wus = new Writeuser();
                try {
                    wus.setZhuce(users);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                setVisible(false);
                showDialog("添加用户成功");
                new Guanliyuanjiemian();
            }
            if (p == 4) {
                users.remove((Integer.parseInt(txt1.getText())-1));
                Writeuser wus = new Writeuser();
                try {
                    wus.setZhuce(users);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                setVisible(false);
                showDialog("删除用户成功");
                new Guanliyuanjiemian();
            }

            if (p == 6) {
                Commodity C0 = new Commodity(txt1.getText(), txt2.getText(), Integer.parseInt(txt3.getText()), Integer.parseInt(txt4.getText()));
                commoditys.set(Integer.parseInt(txt5.getText())-1,C0);
                WriteCommodity cs = new WriteCommodity();
                try {
                    cs.setCommodity(commoditys);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                setVisible(false);
                showDialog("修改商品成功");
                new Guanliyuanjiemian();
            }
            if (p == 7) {
                Commodity C0 = new Commodity(txt1.getText(), txt2.getText(), Integer.parseInt(txt3.getText()), Integer.parseInt(txt4.getText()));
                commoditys.add(C0);
                WriteCommodity cs = new WriteCommodity();
                try {
                    cs.setCommodity(commoditys);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                setVisible(false);
                showDialog("添加商品成功");
                new Guanliyuanjiemian();
            }
            if (p == 8) {
                commoditys.remove(Integer.parseInt(txt1.getText())-1);
                WriteCommodity cs = new WriteCommodity();
                try {
                    cs.setCommodity(commoditys);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                setVisible(false);
                showDialog("删除商品成功");
                new Guanliyuanjiemian();
            }

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
}
