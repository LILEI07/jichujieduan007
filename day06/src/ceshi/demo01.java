package ceshi;/*ceshi
@ClassName：demo01
@Description：test
//
@date：2021/9/5 11:51
@作者：李磊
@Version：21.0*/

import java.util.Random;
import java.util.Scanner;

public class demo01 {

    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Random().nextInt(67-7+1)+7;
        }
        System.out.print("数组中的元素有: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("请输入[3-5]之间的任意一个整数:");
        int num=new Scanner(System.in).nextInt();
        System.out.println("数组中是"+num+"倍数的元素有:");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%num==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
