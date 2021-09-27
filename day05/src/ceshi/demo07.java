package ceshi;/*zuoye
@ClassName：demo07
@Description：test
//
@date：2021/9/4 19:11
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数字:");
        int m = sc.nextInt();
        System.out.println("请输入终止数字:");
        int n = sc.nextInt();
        dayinjishu(m, n);
    }

    public static void dayinjishu(int a, int b) {
        if (a > b) {
            System.out.println("您输入的数据有误!");
        } else {
            System.out.print("他们之间的奇数有:");
            for (int i = a; i < b; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
