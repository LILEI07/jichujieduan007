package gongju;
/*@ClassName：readcommodity
@date：2021/9/23 15:12
@作者：李磊
@Version：1.0
@Description：
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCommodity {
    ArrayList<Commodity> commoditys = new ArrayList<>();
    public ArrayList<Commodity> getcommoditys() {
        String ss;
        {
            try {
                ss = gettxt();
                get(ss);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return commoditys;
    }

    private void get(String ss) {
      //  String[] cy = ss.split("\\r\n");
        String[] cy = ss.split("\\r?\\n");
        String[] xiangxi=new String[4];
        for (int i = 0; i < cy.length; i++) {
            //分割用户名和密码
            xiangxi = cy[i].split(",");
            //装入商品数组
            commoditys.add(new Commodity(xiangxi[0], xiangxi[1], Integer.parseInt(xiangxi[2]), Integer.parseInt(xiangxi[3])));
        }
    }

    private static String gettxt() throws IOException {
        FileReader fr = new FileReader("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\数据保存\\商品名单.txt");
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
