package naicha;

import gongju.Commodity;
import gongju.ReadCommodity;
import gongju.ReadUser;
import gongju.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * @Description: test
 * @Create by: 有闲的小孩新子
 * @Date: 2021/9/23 11:18
 */
public class Naicha extends JFrame implements MouseListener {
    /*JTextField naicha = new JTextField();
    JTextField guocha = new JTextField();
    JTextField kafei = new JTextField();
    JTextField oubao = new JTextField();*/

    JLabel tangduText = new JLabel("糖度");
    JLabel wenduText = new JLabel("温度");
    JLabel peiliaoText = new JLabel("配料");

    JRadioButton quantang = new JRadioButton("全糖");

    JRadioButton bantang = new JRadioButton("半糖");
    JRadioButton shaotang = new JRadioButton("少糖");
    JRadioButton wutang = new JRadioButton("无糖");
    ButtonGroup t = new ButtonGroup();  //单选按钮组

    JRadioButton re = new JRadioButton("热");
    JRadioButton wenre = new JRadioButton("温热");
    JRadioButton changwen = new JRadioButton("常温");
    JRadioButton bing = new JRadioButton("冰");
    JRadioButton shaobing = new JRadioButton("少冰");
    ButtonGroup w = new ButtonGroup();  //单选按钮组

    JRadioButton zhenzhu = new JRadioButton("珍珠");
    JRadioButton yeguo = new JRadioButton("椰果");
    JRadioButton buding = new JRadioButton("布丁");
    JRadioButton bujiapeiliao = new JRadioButton("不加配料");
    ButtonGroup p = new ButtonGroup();  //单选按钮组

    ArrayList<User> users = new ArrayList<>();
    ArrayList<String> usersname = new ArrayList<>();
    ArrayList<Commodity> commoditys = new ArrayList<>();
    JButton quxiao = new JButton("取消");
    JButton queren = new JButton("确认");
    int m = -1;//m代表不同的商品
    int number = -1;

    public Naicha(int m, int number) {
        this.m = m;
        this.number = number;
        //读取商品对象
        ReadCommodity readp = new ReadCommodity();
        //传参
        commoditys = readp.getcommoditys();
        //读取用户对象
        ReadUser readu = new ReadUser();
        //传参
        users = readu.getusers();
        for (int i = 0; i < users.size(); i++) {
            usersname.add(users.get(i).getUsername());
        }

        initFrame();
        //添加组件
        initView();
        setVisible(true);
    }

    private void initFrame() {
        //大小
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }

    private void initView() {
        //m代表不同商品
        quantang.setOpaque(false);
        bantang.setOpaque(false);
        shaotang.setOpaque(false);
        wutang.setOpaque(false);

        t.add(quantang);
        t.add(bantang);
        t.add(shaotang);
        t.add(wutang);

        re.setOpaque(false);
        wenre.setOpaque(false);
        changwen.setOpaque(false);
        bing.setOpaque(false);
        shaobing.setOpaque(false);

        w.add(re);
        w.add(wenre);
        w.add(changwen);
        w.add(bing);
        w.add(shaobing);

        zhenzhu.setOpaque(false);
        yeguo.setOpaque(false);
        buding.setOpaque(false);
        bujiapeiliao.setOpaque(false);

        p.add(zhenzhu);
        p.add(yeguo);
        p.add(buding);
        p.add(bujiapeiliao);


        //糖度
        tangduText.setBounds(10, 155, 70, 50);
        //全糖
        quantang.setFont(new Font("宋体", 6, 15));
        quantang.setBounds(50, 160, 70, 40);
        quantang.setSelected(true);
        //半糖
        bantang.setFont(new Font("宋体", 6, 15));
        bantang.setBounds(140, 160, 70, 40);
        //少糖
        shaotang.setFont(new Font("宋体", 6, 15));
        shaotang.setBounds(230, 160, 70, 40);
        //无糖
        wutang.setFont(new Font("宋体", 6, 15));
        wutang.setBounds(320, 160, 70, 40);

        //温度
        wenduText.setBounds(10, 215, 70, 50);
        //热
        re.setFont(new Font("宋体", 6, 15));
        re.setBounds(50, 220, 70, 40);
        re.setSelected(true);
        //温热
        wenre.setFont(new Font("宋体", 6, 15));
        wenre.setBounds(140, 220, 70, 40);
        //常温
        changwen.setFont(new Font("宋体", 6, 15));
        changwen.setBounds(230, 220, 70, 40);
        //冰
        bing.setFont(new Font("宋体", 6, 15));
        bing.setBounds(320, 220, 70, 40);
        //少冰
        shaobing.setFont(new Font("宋体", 6, 15));
        shaobing.setBounds(410, 220, 70, 40);


        //配料
        peiliaoText.setBounds(10, 270, 70, 50);
        //珍珠
        zhenzhu.setFont(new Font("宋体", 6, 15));
        zhenzhu.setBounds(50, 275, 70, 40);
        //椰果
        yeguo.setFont(new Font("宋体", 6, 15));
        yeguo.setBounds(140, 275, 70, 40);
        //布丁
        buding.setFont(new Font("宋体", 6, 15));
        buding.setBounds(230, 275, 70, 40);
        //不加配料
        bujiapeiliao.setFont(new Font("宋体", 6, 15));
        bujiapeiliao.setBounds(320, 275, 120, 40);
        bujiapeiliao.setSelected(true);

        quxiao.setBounds(300, 380, 80, 40);
        quxiao.setFont(new Font("宋体", 6, 20));
        quxiao.addMouseListener(this);

        queren.setBounds(100, 380, 80, 40);
        queren.setFont(new Font("宋体", 6, 20));
        queren.addMouseListener(this);

        JLabel backGround = new JLabel(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\奶茶信息.jpg"));
        backGround.setBounds(0, 0, 500, 500);

        this.getContentPane().add(tangduText);
        this.getContentPane().add(quantang);
        this.getContentPane().add(bantang);
        this.getContentPane().add(shaotang);
        this.getContentPane().add(wutang);

        this.getContentPane().add(wenduText);
        this.getContentPane().add(re);
        this.getContentPane().add(wenre);
        this.getContentPane().add(changwen);
        this.getContentPane().add(shaobing);
        this.getContentPane().add(bing);

        this.getContentPane().add(peiliaoText);
        this.getContentPane().add(zhenzhu);
        this.getContentPane().add(yeguo);
        this.getContentPane().add(buding);
        this.getContentPane().add(bujiapeiliao);

        this.getContentPane().add(quxiao);
        this.getContentPane().add(queren);
        this.getContentPane().add(backGround);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == quxiao) {
            this.setVisible(false);
            new ZhuJieMian(users, usersname, commoditys,number );
        }
        if (e.getSource() == queren) {
            int tang = 0;
            int wendu = 0;
            int peiliao = 0;
            if (quantang.isSelected()) {
                tang = 1;
            }
            if (bantang.isSelected()) {
                tang = 2;
            }
            if (shaotang.isSelected()) {
                tang = 3;
            }
            if (wutang.isSelected()) {
                tang = 4;
            }
            if (re.isSelected()) {
                wendu = 1;
            }
            if (wenre.isSelected()) {
                wendu = 2;
            }
            if (changwen.isSelected()) {
                wendu = 3;
            }
            if (bing.isSelected()) {
                wendu = 4;
            }
            if (shaobing.isSelected()) {
                wendu = 5;
            }
            if (zhenzhu.isSelected()) {
                peiliao = 1;
            }
            if (yeguo.isSelected()) {
                peiliao = 2;
            }
            if (buding.isSelected()) {
                peiliao = 3;
            }
            if (bujiapeiliao.isSelected()) {
                peiliao = 4;
            }
            this.setVisible(false);
            new Querendingdan(tang, wendu, peiliao, m,number);

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

