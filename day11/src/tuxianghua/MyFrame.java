package tuxianghua;
/*@ClassName：MyFrame
@date：2021/9/17 15:47
@作者：李磊
@Version：1.0
@Description：

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        //调用父类 JFrame 的带参构造方法
        setTitle(title);
        //JFrame.EXIT_ON_CLOSE:表示当窗看关闭于时，同时退出进程。且使用 System exit 方法退出应用程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口的其他参数，如窗口大小
        setSize(1950, 1050);
        // 显示窗口
        setVisible(true);
        //为null，则此窗口将置于屏幕的中央
        setLocationRelativeTo(null);
        //内容面板：ContentPane，窗口的灰色部分
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        //取消内部默认布局(重点)
        setLayout(null);


        //设置并添加背景图片
        JLabel tupian = new JLabel(new ImageIcon("C:\\Users\\李磊\\Desktop\\p0.png"));
        tupian.setOpaque(true);
        tupian.setBounds(270, 0, 980, 106);

        //注册文本框
        JLabel zhuce = new JLabel("注册");
        zhuce.setFont(new Font("黑体", 1, 40));
        zhuce.setBounds(680, 100, 100, 100);

        //昵称文本框
        JTextField yonghuming = new JTextField(" 昵称");
        String str0 = yonghuming.getText();
        System.out.println(str0);
        yonghuming.setFont(new Font("微软雅黑", 0, 20));
        yonghuming.setBounds(500, 250, 500, 50);

        //密码文本框
        JTextField mima = new JTextField(" 密码（6~16）个字符组成，区分大小写");
        String str1 = mima.getText();
        System.out.println(str1);
        mima.setFont(new Font("微软雅黑", 0, 20));
        mima.setBounds(500, 350, 500, 50);

        //电话文本框
        JComboBox<String> diqu = new JComboBox<>();
        JTextField dianhua = new JTextField(" 填写常用手机号");
        diqu.addItem("中国大陆");
        diqu.addItem("中国香港");
        diqu.addItem("中国澳门");
        diqu.addItem("中国台湾");
        diqu.addItem("美国");
        diqu.addItem("日本");
        diqu.addItem("比利时");
        diqu.addItem("新加坡");
        diqu.setBounds(500, 450, 100, 50);
        dianhua.setBounds(610, 450, 390, 50);

        //验证码
        JTextField yanzhengshuru = new JTextField(" 请输入验证码");
        JButton yanzheng = new JButton("点击获取");
        yanzheng.setBackground(Color.BLUE);
        yanzheng.setFont(new Font("微软雅黑", 0, 20));
        yanzheng.setForeground(Color.white);

        yanzhengshuru.setBounds(500, 550, 350, 50);
        yanzheng.setBounds(860, 550, 140, 50);

        //创建复选框对象（协议）
        JCheckBox xieyi = new JCheckBox("我已同意《哔哩哔哩弹幕网用户使用协议》和《哔哩哔哩隐私政策》");
        xieyi.setFont(new Font("微软雅黑", 0, 15));
        xieyi.setBounds(500, 630, 500, 15);
        xieyi.setSelected(false);
        //创建注册按钮
        JButton zhuce01 = new JButton("注册");
        zhuce01.setBounds(500, 660, 500, 50);
        zhuce01.setEnabled(false);
        zhuce01.setFont(new Font("微软雅黑", 0, 20));
        zhuce01.setToolTipText("请先勾选协议！");

        // 向内容面板里添加控件 , 如 JLabel, JButton
        contentPane.add(tupian);
        contentPane.add(zhuce);
        contentPane.add(yonghuming);
        contentPane.add(mima);
        contentPane.add(diqu);
        contentPane.add(dianhua);
        contentPane.add(yanzheng);
        contentPane.add(yanzhengshuru);
        contentPane.add(xieyi);
        contentPane.add(zhuce01);


        //注册框监听器
        //和普通按钮类似，使用 JCheckBox. addActionListener()可以添加一个监听器，
        xieyi.addActionListener(new ActionListener() {
            @Override
            //当复选框状态改变时监听器被调用
            public void actionPerformed(ActionEvent e) {
                if (xieyi.isSelected()) {//可以获取到当前复选框，是否处于选中状态
                    //JTextField里setEnabled方法，true:可用文本框，false:不可用文本框
                    zhuce01.setEnabled(true);
                    zhuce01.setToolTipText("");

                } else {
                    zhuce01.setEnabled(false);
                    zhuce01.setToolTipText("请先勾选协议！");
                }
            }
        });
    }
}

