package game2048;
/*@ClassName：App
@date：2021/9/18 10:37
@作者：李磊
@Version：1.0
@Description：

*/

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {

        ArrayList<User> users = new ArrayList<>();
        ArrayList<String> usersname = new ArrayList<>();
        //获取注册信息,并装入对应的容器；
        String ss = getZhuce();
        String[] user = ss.split("\\n");
        String xiangxi[];
        for (int i = 0; i < user.length; i++) {
            //分割用户名和密码
            xiangxi = user[i].split(",");
            //装入用户数组
            users.add(new User(xiangxi[0], xiangxi[1]));
            //装入用户名数组
            usersname.add(xiangxi[0]);
        }
        //进入登录界面
        DengluJFrame myJFrame = new DengluJFrame(users, usersname);
    }

    //读取文件
    private static String getZhuce() throws IOException {
        FileReader fr = new FileReader("E:\\develop\\素材\\2048\\2048登录注册\\用户名单.txt");
        //用于接收读取到的字符
        int len = 0;
        String aa = "";
        //循环读取到len=-1,即文件末尾
        while ((len = fr.read()) != -1) {
            //不加强转输出结果是数字,要将他们转换为字符
            char len1 = (char) len;
            aa += len1;
        }
        //关流
        fr.close();
        return aa;
    }

}
