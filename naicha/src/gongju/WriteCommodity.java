package gongju;
/*@ClassName：xiecommodity
@date：2021/9/23 15:10
@作者：李磊
@Version：1.0
@Description：

*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCommodity {
    public void setCommodity(ArrayList<Commodity> commoditys) throws IOException {
        File f = new File("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\数据保存\\商品名单.txt");
        //  FileWriter fw = new FileWriter("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\商品名单.txt",true);
        // fw.write("\n");
        FileWriter fw = null;
        try {
            fw = new FileWriter(f);
            fw.write("");
            for (int i = 0; i < commoditys.size(); i++) {
                fw.write(commoditys.get(i).getName() + "," + commoditys.get(i).getType() + "," + commoditys.get(i).getPrice() + "," + commoditys.get(i).getIntegral());
                fw.write("\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

 /*       for (int i = 0; i < commoditys.size(); i++) {
            fw.write(commoditys.get(i).getName()+","+commoditys.get(i).getType()+","+commoditys.get(i).getPrice() +","+commoditys.get(i).getIntegral());
            fw.write("\n");
        }
        //刷新
        fw.flush();
        //关闭流
        fw.close();
    }*/
    }
}
