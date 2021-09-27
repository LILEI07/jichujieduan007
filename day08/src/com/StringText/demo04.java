package com.StringText;/*com.StringText
@ClassName：demo04
@Description：test
//
@date：2021/9/8 14:23
@作者：李磊
@Version：21.0*/
/*
遍历字符串
 */
public class demo04 {
    public static void main(String[] args) {
        String s="每天都去锻炼一下!";

        //获取字符遍历
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            System.out.println(c);
        }
        System.out.println("---------");
        //转换为字符数组进行遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
