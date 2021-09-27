package com.itheima;
/*
逢七过
 */
public class Demo05 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <=1000; i++) {
            if(i/100!=7&&i%10!=7&&i/10%10!=7&&i%7!=0){
                System.out.print(i+" ");
                count++;
                if(count%5==0){
                    System.out.println();
                }
            }
        }
    }
}
