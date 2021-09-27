package com.text2;/*com.text2
@ClassName：demo03
@Description：test
//
@date：2021/9/8 18:15
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
字符出现次数统计案例
 */
public class demo03 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        String ss=new Scanner(System.in).nextLine();
        char[] arr = ss.toCharArray();
        int daxie=0,xiaoxie=0,shuzi=0,qita=0;
        for (int i = 0; i < arr.length; i++) {
            if('0'<=arr[i]&&arr[i]<='9'){
                shuzi++;

            }else if('a'<=arr[i]&&arr[i]<='z'){
                xiaoxie++;

            }else if('A'<=arr[i]&&arr[i]<='Z'){
                daxie++;

            }else{
                qita++;
            }

        }
        System.out.println("大写:+"+daxie+",小写:"+xiaoxie+",数字:"+shuzi+",其它:"+qita);

    }
}
