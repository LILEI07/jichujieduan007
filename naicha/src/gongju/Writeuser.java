package gongju;
/*@ClassName：xieuser
@date：2021/9/23 14:20
@作者：李磊
@Version：1.0
@Description：

*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writeuser {
    public void setZhuce(ArrayList<User> users) throws IOException {

        File f = new File("E:\\develop\\IdeaProjects\\lilei_code\\naicha\\src\\gongju\\甜蜜蜜\\数据保存\\用户名单.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(f);
            fw.write("");
            for (int i = 0; i < users.size(); i++) {
                fw.write(users.get(i).getUsername()+","+users.get(i).getPassword()+","+users.get(i).getTelephone() +","+users.get(i).getIntegral());
                fw.write("\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
