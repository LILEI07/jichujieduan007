package com.text2;/*com.text2
@ClassName：demo04
@Description：test
//
@date：2021/9/8 18:27
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
判断字符串对称案例
 */
public class demo04 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        String ss=new Scanner(System.in).nextLine();
        String s=new StringBuffer(ss).reverse().toString();
        if(s.equals(ss)){
            System.out.println("对称");
        }else{
            System.out.println("不对称");
        }

    }
}
