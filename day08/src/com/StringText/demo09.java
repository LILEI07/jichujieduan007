package com.StringText;/*com.StringText
@ClassName：demo09
@Description：test
//
@date：2021/9/8 16:00
@作者：李磊
@Version：21.0*/

public class demo09 {
    public static void main(String[] args) {

        String ss="";
        long l = System.currentTimeMillis();
        for (int i = 0; i <100000; i++) {
            ss=ss+i;
        }
        long e = System.currentTimeMillis();
        System.out.println(e-l);
    }
}
