package com.text2;/*com.text2
@ClassName：demo07
@Description：test
//
@date：2021/9/8 18:56
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
字符串遍历
 */
public class demo07 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串!");
        String ss=new Scanner(System.in).nextLine();
        char[] arr = ss.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < ss.length(); i++) {
            System.out.println(ss.charAt(i));
        }
    }
}
