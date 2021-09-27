package ceshi;/*ceshi
@ClassName：demo222
@Description：test
//
@date：2021/9/5 20:29
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

public class demo222 {


    public static void main(String[] args) {
        System.out.println("请输入几个数并用逗号隔开:");
        Scanner sc = new Scanner(System.in);//从键盘接收数据
        String str = sc.next().toString();//next()方式接收字符串
        System.out.println(str);
        String[] arr = str.split(",");

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}



