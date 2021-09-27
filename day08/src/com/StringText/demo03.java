package com.StringText;/*com.StringText
@ClassName：demo03
@Description：test
//
@date：2021/9/8 11:19
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
用户登录案例
 */
public class demo03 {
    public static void main(String[] args) {
        String username="张三";
        String passwrod="123456789";
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请用户输入ID:");
            String name=sc.nextLine();
            System.out.println("请用户输入密码:");
            String pass=sc.nextLine();
            if(!name.equals(username) || !pass.equals(passwrod)){
                if(i==2){
                    System.out.println("您的三次机会已用尽,请联系管理员!");
                    break;
                }
                System.out.println("您的密码或者ID有误,请重新输入,您还有"+(2-i)+"次机会");
            }else {
                System.out.println("登录成功");
                break;
            }
        }



    }
}
