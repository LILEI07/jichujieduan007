package naicha;
//提交订单后，修改用户积分，提前关闭主页面，创建新的主页面并传递用户参数

import gongju.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Description: test
 * @Create by: 有闲的小孩新子
 * @Date: 2021/9/23 18:52
 */
public class Querendingdan extends JFrame implements MouseListener {
    ArrayList<User> users;
    ArrayList<String> usersname = new ArrayList<>();
    ArrayList<Commodity> commoditys;

    JLabel dingdanxinxiText = new JLabel("订单信息:");
    JLabel zongjiText = new JLabel();
    JButton lijixiadan = new JButton("立即下单");
    JButton quxiaoxiadan = new JButton("取消下单");
    int tang = 0;
    int wendu = 0;
    int peiliao = 0;
    int m = -1;//不同的商品
    int number = -1;//不同的用户
    JLabel tangdutxt = new JLabel();
    JLabel wendutxt = new JLabel();
    JLabel peiliaotxt = new JLabel();
    JLabel Commoditytxt = new JLabel();
    // JLabel Pricetxt = new JLabel();
    JLabel Integraltxt = new JLabel();
    JDialog jDialog = new JDialog();

    //   JTextField naichatxt=new JTextField();
    public Querendingdan(int tang, int wendu, int peiliao, int m,int number) {
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


        this.tang = tang;
        this.wendu = wendu;
        this.peiliao = peiliao;
        this.m = m;
        this.number =number;
        initFrame();
        //添加组件
        initView();
        setVisible(true);
    }

    private void initView() {
        dingdanxinxiText.setBounds(10, 10, 140, 50);
        dingdanxinxiText.setFont(new Font("宋体", 6, 20));

        zongjiText.setBounds(250, 350, 200, 50);
        zongjiText.setFont(new Font("宋体", 6, 20));

        quxiaoxiadan.setBounds(320, 280, 140, 50);
        quxiaoxiadan.setFont(new Font("宋体", 6, 20));
        quxiaoxiadan.addMouseListener(this);

        lijixiadan.setBounds(150, 280, 140, 50);
        lijixiadan.setFont(new Font("宋体", 6, 20));
        lijixiadan.addMouseListener(this);

        if (m == 0) {
            Commoditytxt.setText("商品名称：芝芝嫩芽");
        } else if (m == 1) {
            Commoditytxt.setText("商品名称：纯碎银子");
        } else if (m == 2) {
            Commoditytxt.setText("商品名称：酒酿桂花冻");
        } else if (m == 3) {
            Commoditytxt.setText("商品名称：冰山杨梅");
        } else if (m == 4) {
            Commoditytxt.setText("商品名称：思想龙眼");
        } else if (m == 5) {
            Commoditytxt.setText("商品名称：杨枝甘露");
        } else if (m == 6) {
            Commoditytxt.setText("商品名称：冷萃美式");
        } else if (m == 7) {
            Commoditytxt.setText("商品名称：椰椰美式");
        } else if (m == 8) {
            Commoditytxt.setText("商品名称：椰子拿铁");
        } else {
            System.out.println("奶茶展示名称调用参数错误！");
        }

        if (m == 0) {
            zongjiText.setText("总计：14 元");
        } else if (m == 1) {
            zongjiText.setText("总计：16 元");
        } else if (m == 2) {
            zongjiText.setText("总计：17 元");
        } else if (m == 3) {
            zongjiText.setText("总计：17 元");
        } else if (m == 4) {
            zongjiText.setText("总计：17 元");
        } else if (m == 5) {
            zongjiText.setText("总计：17 元");
        } else if (m == 6) {
            zongjiText.setText("总计：15 元");
        } else if (m == 4) {
            zongjiText.setText("总计：16 元");
        } else if (m == 8) {
            zongjiText.setText("总计：17 元");
        } else {
            System.out.println("奶茶展示价格调用参数错误！");
        }

        if (m == 0) {
            Integraltxt.setText("商品积分：14 积分");
        } else if (m == 1) {
            Integraltxt.setText("商品积分：16 积分");
        } else if (m == 2) {
            Integraltxt.setText("商品积分：17 积分");
        } else if (m == 3) {
            Integraltxt.setText("商品积分：17 积分");
        } else if (m == 4) {
            Integraltxt.setText("商品积分：17 积分");
        } else if (m == 5) {
            Integraltxt.setText("商品积分：17 积分");
        } else if (m == 6) {
            Integraltxt.setText("商品积分：15 积分");
        } else if (m == 7) {
            Integraltxt.setText("商品积分：16 积分");
        } else if (m == 8) {
            Integraltxt.setText("商品积分：17 积分");
        } else {
            System.out.println("奶茶展示积分调用参数错误！");
        }

            if (tang == 1) {
                tangdutxt.setText("糖度：全糖");
            } else if (tang == 2) {
                tangdutxt.setText("糖度：半糖");
            } else if (tang == 3) {
                tangdutxt.setText("糖度：少糖");
            } else {
                tangdutxt.setText("糖度：无糖");
            }



        if (wendu == 1) {
            wendutxt.setText("温度：热");
        } else if (wendu == 2) {
            wendutxt.setText("温度：温热");
        } else if (wendu == 3) {
            wendutxt.setText("温度：常温");
        } else if (wendu == 4) {
            wendutxt.setText("温度：冰");
        } else {
            wendutxt.setText("温度：少冰");
        }

        if(m>=0&&m<=2){
            if (peiliao == 1) {
                peiliaotxt.setText("配料：珍珠");
            } else if (peiliao == 2) {
                peiliaotxt.setText("配料：椰果");
            } else if (peiliao == 3) {
                peiliaotxt.setText("配料：布丁");
            } else {
                peiliaotxt.setText("配料：不加配料");
            }
        }
        if(m>=3&&m<=5){
            if (peiliao == 1) {
                peiliaotxt.setText("配料：芝士");
            } else if (peiliao == 2) {
                peiliaotxt.setText("配料：奶盖");
            } else if (peiliao == 3) {
                peiliaotxt.setText("配料：雪糕");
            } else {
                peiliaotxt.setText("配料：不加配料");
            }
        }

        if(m>=6&m<=8){
            if (peiliao == 1) {
                peiliaotxt.setText("配料：奶盖");
            } else if (peiliao == 2) {
                peiliaotxt.setText("配料：奶油");
            } else if (peiliao == 3) {
                peiliaotxt.setText("配料：巧克力酱");
            } else {
                peiliaotxt.setText("配料：不加配料");
            }
        }

        Commoditytxt.setBounds(150, 10, 200, 80);
        Commoditytxt.setFont(new Font("宋体", 6, 20));

        tangdutxt.setBounds(180, 50, 100, 80);
        tangdutxt.setFont(new Font("宋体", 6, 20));


        wendutxt.setBounds(180, 100, 100, 80);
        wendutxt.setFont(new Font("宋体", 6, 20));
        peiliaotxt.setBounds(180, 150, 150, 80);
        peiliaotxt.setFont(new Font("宋体", 6, 20));
        Integraltxt.setBounds(180, 200, 200, 80);
        Integraltxt.setFont(new Font("宋体", 6, 20));

        this.getContentPane().add(Commoditytxt);
        this.getContentPane().add(Integraltxt);
        this.getContentPane().add(tangdutxt);
        this.getContentPane().add(wendutxt);
        this.getContentPane().add(peiliaotxt);
        this.getContentPane().add(dingdanxinxiText);
        this.getContentPane().add(lijixiadan);
        this.getContentPane().add(quxiaoxiadan);
        this.getContentPane().add(zongjiText);
    }

    private void initFrame() {
        setSize(500, 500);

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == quxiaoxiadan) {

            this.setVisible(false);
            new ZhuJieMian(users,usersname,commoditys,number);
        }
        if (e.getSource() == lijixiadan) {
            //修改用户信息
            int jifen = users.get(number).getIntegral();
            int jifen0=jifen+commoditys.get(m).getPrice();
            //修改积分
            users.get(number).setIntegral(jifen0);
            //更改本地文件

            Writeuser wus = new Writeuser();
            try {
                wus.setZhuce(users);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            showDialog("下单成功");
            showDialog("您的积分已变更！");
            new ZhuJieMian(users, usersname, commoditys, number);
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
