package tuxianghua;
/*@ClassName：demo
@date：2021/9/17 9:36
@作者：李磊
@Version：1.0
@Description：

*/

import javax.swing.*;
import java.awt.*;

public class demo {
    private static void createGUI(){
        // JFrame 指一个窗口，构造方法的参数为窗口标题
        JFrame frame = new JFrame("测试");
        //JFrame.EXIT_ON_CLOSE:表示当窗看关闭于时，同时退出进程。且使用 System exit 方法退出应用程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //内容面板：ContentPane，窗口的灰色部分
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());

        // 向内容面板里添加控件 , 如 JLabel, JButton
        JLabel jLabel = new JLabel("Hello,World");
        contentPane.add(jLabel);
        JLabel jLabel001 = new JLabel("大傻子，是你吗？");
        contentPane.add(jLabel001);
        JButton jButton = new JButton("测试");
        contentPane.add(jButton);

        // 设置窗口的其他参数，如窗口大小
        frame.setSize(1000, 300);
        // 显示窗口
        frame.setVisible(true);
    }

    //然后在 main 里运行这个方法
    public static void main(String[] args){
        //此段代码间接地调用了createGUI(),照抄此代码框架即可
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createGUI();
            }
        });
    }

}
