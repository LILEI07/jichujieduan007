package com.itheima;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println("请输入要查询的月数");
        int mooth= new Scanner(System.in).nextInt();
        switch (mooth)
        {
            case 2:
            case 3:
            case 4:
                System.out.println("春天");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("夏天");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("秋天");
                break;
            case 11:
            case 12:
            case 1:
                System.out.println("冬天");
                break;
            default:
                System.out.println("您输入的数据有误");
        }
    }



}
