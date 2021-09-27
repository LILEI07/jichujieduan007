package com.StringText;/*com.StringText
@ClassName：demo07
@Description：test
//
@date：2021/9/8 15:16
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
tmd替换
 */
public class demo07 {
    public static void main(String[] args) {
        System.out.println("请输入一段对话:");
        String ss=new Scanner(System.in).nextLine();
        String s=ss.replace("tmd","***");
        System.out.println(s);

}}
