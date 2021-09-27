package tuxianghua;
/*@ClassName：demo01
@date：2021/9/17 11:03
@作者：李磊
@Version：1.0
@Description：

*/

import javax.swing.*;
import java.awt.*;

public class demo01 extends JFrame {
    JLabel timeLabel = new JLabel("00:00:00");
    JButton button = new JButton("显示时间");

    public void MyJFrame(String title) {
        //调用父类 JFrame 的带参构造方法
        setTitle(title);
        //JFrame.EXIT_ON_CLOSE:表示当窗看关闭于时，同时退出进程。且使用 System exit 方法退出应用程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口的其他参数，如窗口大小
        setSize(400, 300);
        // 显示窗口
        setVisible(true);
        //给按钮增加图标
        button.setIcon(new ImageIcon("图片路径"));


        // 内容面板 (ContentPane)
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        // 向内容面板里添加控件
        contentPane.add(button);
        contentPane.add(timeLabel);
    }
}
