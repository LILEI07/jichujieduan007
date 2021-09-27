package naicha;

import gongju.User;
import gongju.Writeuser;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

public class Zhuxiaoyonghu extends JFrame implements MouseListener {
    ArrayList<User> users = new ArrayList<>();
    ArrayList<String> usersname = new ArrayList<>();
    JButton shanchu = new JButton("确定删除！！");
    JDialog jDialog = new JDialog();
    JTextField jiumimatxt = new JTextField();
    //标记用户
    int number = -1;

    public Zhuxiaoyonghu(ArrayList<User> users, ArrayList<String> usersname, int number) {
        this.usersname = usersname;
        this.users = users;
        this.number = number;
        //对主界面进行设置
        initFrame();
        //在主界面中添加其他组件
        shan();

        setVisible(true);
    }

    public void shan() {

        shanchu.setIcon(new ImageIcon(""));
        shanchu.setBounds(150, 300, 120, 40);
        shanchu.addMouseListener(this);
        shanchu.setContentAreaFilled(false);

        // 添加背景图片
        JLabel backGround = new JLabel(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\注销.jpg"));
        backGround.setBounds(0, 0, 470, 390);

        JLabel jiumimaText = new JLabel("请验证账户密码：");
        jiumimaText.setBounds(180, 100, 150, 25);
        jiumimatxt.setBounds(150, 200, 200, 30);
        //
        this.getContentPane().add(jiumimaText);
        this.getContentPane().add(jiumimatxt);
        this.getContentPane().add(shanchu);
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
        if (e.getSource() == shanchu) {
            if (jiumimatxt.getText().equals(users.get(number).getPassword())) {
               //修改对应用户集合，用户名集合
                usersname.remove(number);
                users.remove(number);
                //修改本地文件
                Writeuser wus = new Writeuser();
                try {
                    wus.setZhuce(users);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                mayan("注销用户成功！！");
                //进入登录界面
                new Denglujiemian();
                this.setVisible(false);

            }else{
                mayan("密码错误！");
            }

        }


    }

    public void mayan(String content) {
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
