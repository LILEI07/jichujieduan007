package ceshi;/*zuoye
@ClassName：demo08
@Description：test
//
@date：2021/9/4 19:13
@作者：李磊
@Version：21.0*/

public class demo08 {
    public static void main(String[] args) {
        int a = 888;
        int b = 35;
        int max = getmax(a, b);
        System.out.println("max:" + max);
    }

    public static int getmax(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }
}
