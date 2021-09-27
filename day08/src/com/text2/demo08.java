package com.text2;/*com.text2
@ClassName：demo08
@Description：test
//
@date：2021/9/8 18:59
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
统计字符串字符类型
 */
public class demo08 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        String ss=new Scanner(System.in).nextLine();
        int daxie=0,xiaoxie=0,shuzi=0,qita=0;
        for (int i = 0; i < ss.length(); i++) {
            if(ss.charAt(i)>='0'&&ss.charAt(i)<='9'){
                shuzi++;
            }else if(ss.charAt(i)>='a'&&ss.charAt(i)<='z'){
                xiaoxie++;
            }else if(ss.charAt(i)>='A'&&ss.charAt(i)<='Z'){
                daxie++;
            }else{
                qita++;
            }
        }
        System.out.println("数字:"+shuzi);
        System.out.println("小写:"+xiaoxie);
        System.out.println("大写:"+daxie);
        System.out.println("其它:"+qita);

    }
}
