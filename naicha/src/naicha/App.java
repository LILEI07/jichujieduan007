package naicha;
/*@ClassName：app
@date：2021/9/23 11:29
@作者：李磊
@Version：1.0
@Description：
*/

import gongju.*;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<String> usersname = new ArrayList<>();
        ArrayList<Commodity> commoditys = new ArrayList<>();
        //读取商品对象
        ReadCommodity readp =new ReadCommodity();
        //传参
        commoditys=readp.getcommoditys();
        //读取用户对象
        ReadUser readu =new ReadUser();
        //传参
        users =readu.getusers();
        for (int i = 0; i < users.size(); i++) {
            usersname.add(users.get(i).getUsername());
        }
        //进入管理员界面
       // Guanliyuanjiemian myJFrame = new Guanliyuanjiemian();
     //  ZhuJieMian myJFrame = new ZhuJieMian(users,usersname,commoditys,12);
    //    Dodata aa=new Dodata(4);
       Denglujiemian myJFrame = new Denglujiemian();
       // Show show=new Show(1);

    }
}