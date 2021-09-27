package yuxizuoye;/*yuxizuoye
@ClassName：demo01
@Description：test
//
@date：2021/9/3 19:12
@作者：李磊
@Version：21.0*/

/*
数值拆分案例(除、取余)
水仙花数
 */
public class demo01 {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + bai * bai * bai + shi * shi * shi == i) {
                System.out.println(i);

            }
        }
    }
}
