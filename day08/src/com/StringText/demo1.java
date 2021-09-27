package com.StringText;/*com.StringText
@ClassName：demo1
@Description：test
//
@date：2021/9/8 9:07
@作者：李磊
@Version：21.0*/
/*
字符串的构造方式:
空字符串对象
字符数组创建对象
字符串带参构造
直接赋值字符串给字符串变量
 */
public class demo1 {
    public static void main(String[] args) {
        String s1=new String();
        char arr[]={'a','b','c','1'};
        String s2=new String(arr);
        //字符串带参构造,创建了两个字符串对象
        String s3=new String("abc2");
        String s4="abc3";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
