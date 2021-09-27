package com.StringText;/*com.StringText
@ClassName：demo11
@Description：test
//
@date：2021/9/8 16:50
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

public class demo11 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        StringBuilder S1 = new StringBuilder(S);
        String s = S1.reverse().toString();
        if (s.equals(S)) {
            System.out.println("对称");
        } else {
            System.out.println("不对称");
        }
    }
}
