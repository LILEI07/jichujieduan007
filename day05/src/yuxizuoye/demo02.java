package yuxizuoye;/*yuxizuoye
@ClassName：demo02
@Description：test
//
@date：2021/9/3 19:21
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
找出三个整数中的最大值(三元运算符)
 */
public class demo02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;int b;int c;
        System.out.println("请输入您要比较的三个数:");
        a=sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        int max=((a>b)?a:b)>c?((a>b)?a:b):c;
        System.out.println("其中的最大数是:"+max);

    }
}
