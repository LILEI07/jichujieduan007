package com.itheima;
/*
珠峰折纸
 */
public class Demo06 {
    public static void main(String[] args) {
        double zhi=0.1/1000;
        int count=0;
        double zhufeng=8844.43;
        while(zhi<zhufeng){
            zhi=zhi*2;
            count++;
        }
        System.out.println("共需要折纸"+count+"次。");
    }
}
