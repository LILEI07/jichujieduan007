package com.StringText;/*com.StringText
@ClassName：demo06
@Description：test
//
@date：2021/9/8 15:14
@作者：李磊
@Version：21.0*/

/*
隐藏手机号码
 */
public class demo06 {
    public static void main(String[] args) {
        String num = "18700586338";
        String s1 = num.substring(7);
        String s2 = num.substring(0, 3);
        System.out.println(s2 + "****" + s1);
    }
}
