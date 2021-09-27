package com.text2;/*com.text2
@ClassName：demo06
@Description：test
//
@date：2021/9/8 18:50
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
用户登录案例
 */
public class demo06 {
    public static void main(String[] args) {
        String NAME="张三";
        String password="1234567";
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String name=sc.nextLine();
            System.out.println("请输入密码");
            String pass=sc.nextLine();
            if(name.equals(NAME)&&pass.equals(password)){
                System.out.println("登录成功");
                break;
            }else if(i==2){
                System.out.println("登录失败,您的三次机会已用尽,请联系管理员!");
            }else{
                System.out.println("用户名或密码错误,您还有"+(2-i)+"次机会,请重新输入!");
            }
        }


    }
}
