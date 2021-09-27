package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
猜大小
 */
public class Demo07 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      //  int num=new Random().nextInt();
        int num=(int)(Math.random()*(100-1)+1);
        while(true){
            System.out.println("请输入您要猜的数");
            int cai= sc.nextInt();
            if(cai<1||cai>100){
                System.out.println("您输入的数据有误，请重新输入！");
            }else if(cai>num){
                System.out.println("大了，请重新猜");
            }else if(cai<num){
                System.out.println("小了，请重新猜");
            }else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
