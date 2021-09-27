package ceshi;/*zuoye
@ClassName：demo03
@Description：test
//
@date：2021/9/4 18:07
@作者：李磊
@Version：21.0*/

/*
定义方法打印最大值
 */
public class demo03 {
    public static void main(String[] args) {
        int a=50;int b=60;
        int max=getmax(a,b);
        System.out.println("max:"+max);
    }

    public static int getmax(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }
}
