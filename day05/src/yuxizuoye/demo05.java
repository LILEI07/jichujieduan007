package yuxizuoye;/*yuxizuoye
@ClassName：demo05
@Description：test
//
@date：2021/9/3 19:35
@作者：李磊
@Version：21.0*/
/*
 逢七过，一行打印5个满足条件的数(for循环、计数器)
 */
public class demo05 {
    public static void main(String[] args) {
        System.out.println("0~1000中逢七过的的数有:");
        int index= 0;
        for (int i = 0; i < 1001; i++) {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100;

            if(ge!=7&&shi!=7&&bai!=7&&i%7!=0){
                System.out.print(i+" ");
                index++;
                if(index%5==0){
                    System.out.println();
                }
            }
        }
    }
}
