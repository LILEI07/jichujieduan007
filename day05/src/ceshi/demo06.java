package ceshi;/*zuoye
@ClassName：demo06
@Description：test
//
@date：2021/9/4 19:11
@作者：李磊
@Version：21.0*/


import java.util.Scanner;

/*
定义方法判断输入的整数的奇偶性
 */
public class demo06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要判断的数:");
        jiouxing(sc.nextInt());
    }

    public static void jiouxing(int a) {
        if(a%2==0){
            System.out.println("您输入的整数是偶数!");
        }else
            System.out.println("您输入的整数是奇数!");
    }
}
