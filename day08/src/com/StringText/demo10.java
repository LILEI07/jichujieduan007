package com.StringText;/*com.StringText
@ClassName：demo10
@Description：test
//
@date：2021/9/8 16:32
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {

        System.out.println("请输入一个字符串");
        String ss=new Scanner(System.in).nextLine();
        StringBuilder s=new StringBuilder(ss);
        String s1 = s.append("大家好").append("明天干什么").append("无限好").reverse().toString();
        System.out.println("s1的长度:"+s.length());
        System.out.println(s1);
    }
}
