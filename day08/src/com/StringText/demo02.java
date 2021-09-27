package com.StringText;/*com.StringText
@ClassName：demo02
@Description：test
//
@date：2021/9/8 11:16
@作者：李磊
@Version：21.0*/
/*
字符串的比较
 */
public class demo02 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abcd";
        String s3="abc";
        String s4="ABCD";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        //忽略大小写
        System.out.println(s2.equalsIgnoreCase(s4));
    }
}
