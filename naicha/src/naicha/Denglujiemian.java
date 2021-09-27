package naicha;

import gongju.Commodity;
import gongju.ReadUser;
import gongju.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
// 登录JFrame

/**
 * 11:17
 */
public class Denglujiemian extends JFrame implements MouseListener {
    JButton login = new JButton();    // 登录按钮
    JButton register = new JButton();   // 注册按钮
    JTextField username = new JTextField();   // 账号（电话号码组成）
    JTextField password = new JTextField();   // 密码
    JTextField yanzhengma = new JTextField();  // 验证码
    JDialog jDialog = new JDialog();
    ArrayList<User> userList;
    ArrayList<String> usernamelist = new ArrayList<>();
    ArrayList<Commodity> commoditys = new ArrayList<>();
    //图形验证码
    private Yanzheng vcode = new Yanzheng();

    public Denglujiemian() {
        //对主界面进行设置
  /*      this.userList = users;
        this.usernamelist = usersname;
        this.commoditys = commoditys;*/
        //读取用户对象
        ReadUser readu = new ReadUser();
        //传参
        userList = readu.getusers();
        for (int i = 0; i < userList.size(); i++) {
            usernamelist.add(userList.get(i).getUsername());
        }
        //主界面大小
        initFrame();
        //在主界面中添加其他组件
        initView();
        setVisible(true);
    }

    public void initFrame() {
        //大小
        setSize(670, 470);
        //居中
        setLocationRelativeTo(null);
        //置顶
        setAlwaysOnTop(true);
        //关闭模式
        setDefaultCloseOperation(3);
        //取消内部默认布局
        setLayout(null);
    }

    public void initView() {
        //标题栏图片
        Image logo = Toolkit.getDefaultToolkit().getImage("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\喜茶头像.png");
        setIconImage(logo);
        TrayIcon icon = new TrayIcon(logo);
        icon.setImageAutoSize(true);
        //添加用户名图片 输入框
        JLabel usernameText = new JLabel(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\用户名.jpg"));
        usernameText.setBounds(204, 204, 51, 19);
        username.setBounds(283, 193, 200, 30);

        //添加密码图片 输入框
        JLabel passwordText = new JLabel(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\密码.jpg"));
        passwordText.setBounds(218, 264, 35, 18);
        password.setBounds(283, 254, 200, 30);
        // 添加验证码提示图片 输入框
        JLabel yanzhengmaText = new JLabel(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\验证码.png"));
        yanzhengmaText.setBounds(204, 328, 55, 20);

        vcode.setBounds(370, 305, 100, 30);
        yanzhengma.setBounds(283, 317, 70, 30);

        login.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\登录.png"));
        login.setBounds(221, 355, 90, 40);
        //给登录按钮绑定鼠标监听
        //当事件被触发之后，执行当前类中的对应方法
        login.addMouseListener(this);

        register.setIcon(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\注册.png"));
        register.setBounds(344, 355, 90, 40);
        //给注册按钮绑定鼠标事件，当事件被触发，执行当前类的对应的方法。
        register.addMouseListener(this);

        JLabel backGround = new JLabel(new ImageIcon("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\图片资料\\背景1.png"));
        backGround.setBounds(0, 0, 650, 460);
        this.setTitle("喜茶");
        this.getContentPane().add(username);
        this.getContentPane().add(password);
        this.getContentPane().add(usernameText);
        this.getContentPane().add(passwordText);
        this.getContentPane().add(login);
        this.getContentPane().add(register);
        this.getContentPane().add(yanzhengmaText);
        this.getContentPane().add(yanzhengma);
        this.add(vcode);
        this.getContentPane().add(backGround);
    }

    public void showDialog(String content) {
        //弹框的宽和高
        jDialog.setSize(200, 120);
        //居中
        jDialog.setLocationRelativeTo(null);
        //置顶
        jDialog.setAlwaysOnTop(true);
        //删除弹框中所有的内容
        jDialog.getContentPane().removeAll();
        //创建一个JLabel去编写文本内容
        JLabel jLabel = new JLabel(content);
        //把文本添加到弹框当中
        jDialog.add(jLabel);
        //把弹框展示出来
        jDialog.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        // 登录按下后 判断 用户名、密码、 验证码
        if (e.getSource() == login) {
            if ("".equals(yanzhengma.getText())) {
                showDialog("请重新输入验证码！");
                //改写，判断文本输入框的内容，是否在集合中。
            } else {
                boolean b = isValidCodeRight();
                if (b) {

                    if (username.getText().equals("admin") && password.getText().equals("admin")) {
                        //进入管理员界面
                        new Guanliyuanjiemian();
                        //把当前的登录界面关闭
                        this.setVisible(false);
                    } else {
                        //  检测用户名，是否存在，顺便标记用户名的索引
                        int p = fand(usernamelist, username.getText());
                        if (p == -1) {
                            showDialog("该用户不存在，请去注册！");
                        } else {
                            //判断是否为管理员

                            if (username.getText().equals(userList.get(p).getUsername()) && password.getText().equals(userList.get(p).getPassword())) {
                                //  System.out.println("用户名和密码正确以及验证码正确");
                                //  showDialog("登录成功！");
                                new ZhuJieMian(userList, usernamelist, commoditys, p);
                                //把当前的登录界面关闭
                                this.setVisible(false);
                            } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
                                showDialog("请输入用户名和密码！");
                            } else if (username.getText().isEmpty()) {
                                showDialog("请输入用户名！");
                            } else if (password.getText().isEmpty()) {
                                showDialog("请输入密码！");
                            } else {
                                showDialog("用户名或者密码错误请重新输入！");
                            }
                        }
                    }
                } else {
                    showDialog("验证码错误请重新输入！");
                }
            }

        }
        if (e.getSource() == register) {
            //跳转到注册界面
            new zhucejianmian();
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

    // 有任何错误 用户点击了登录 清空所有输入框内容
    private void clear() {
        username.setText("");
        password.setText("");
        yanzhengma.setText("");
    }

    //验证码的确认
    public boolean isValidCodeRight() {
        if (yanzhengma == null) {
            return false;
        }
        if (vcode == null) {
            return false;
        }

        if (vcode.getCode().equals(yanzhengma.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public int fand(ArrayList<String> usernamelist, String gettxt) {
        int p = -1;
        for (int i = 0; i < usernamelist.size(); i++) {
            if (gettxt.equals(usernamelist.get(i))) {
                p = i;
            }
        }
        return p;
    }
}
