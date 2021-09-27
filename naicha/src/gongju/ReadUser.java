package gongju;
/*@ClassName：duuser
@date：2021/9/23 15:10
@作者：李磊
@Version：1.0
@Description：

*/

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadUser {

    ArrayList<User> users = new ArrayList<>();
    ArrayList<String> usersname = new ArrayList<>();


    public ArrayList<String> getname() {
        String ss;
        {
            try {
                ss = gettxt();
                get(ss);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return usersname;
    }

    public ArrayList<User> getusers() {
        String ss;
        {
            try {
                ss = gettxt();
                get(ss);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return users;
    }

    public void get(String ss) {

        String[] user = ss.split("\\r?\\n");
        String[] xiangxi;
        for (int i = 0; i < user.length; i++) {
            //分割用户名和密码
            xiangxi = user[i].split(",");
            //装入用户数组
            users.add(new User(xiangxi[0], xiangxi[1], xiangxi[2], Integer.parseInt(xiangxi[3])));
            //装入用户名数组
            usersname.add(xiangxi[0]);
        }
    }

    private static String gettxt() throws IOException {
        FileReader fr = new FileReader("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\数据保存\\用户名单.txt");
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
