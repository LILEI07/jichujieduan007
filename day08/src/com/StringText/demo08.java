package com.StringText;/*com.StringText
@ClassName：demo08
@Description：test
//
@date：2021/9/8 15:38
@作者：李磊
@Version：21.0*/
/*
字符串切割
 */
public class demo08 {
    public static void main(String[] args) {
        String ss="张三,28,北京,18700586382";
        String[] split = ss.split(",");
        Student stu=new Student(split[0], split[1],split[2],split[3]);
         System.out.println(stu.toString());
    }
}
