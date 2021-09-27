package com.StringText;/*com.StringText
@ClassName：demo05
@Description：test
//
@date：2021/9/8 14:33
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*字符出现次数统计案例：
        提示用户录入一个字符串
        统计字符串中小写字母、大写字母、数字以及其他字符出现的次数*/
public class demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String ss = sc.nextLine();
        char[] chars = ss.toCharArray();
        int xiaoxie = 0, daxie = 0, shuzi = 0, qita = 0;
        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] && chars[i] <= 'z') {
                xiaoxie++;
            } else if ('A' <= chars[i] && chars[i] <= 'Z') {
                daxie++;
            } else if ('0' <= chars[i] && chars[i] <= '9') {
                shuzi++;
            } else {
                qita++;
            }
        }
        System.out.println("大写:"+daxie+",小写:"+xiaoxie+",数字:"+shuzi+",其它"+qita);


    }
}
