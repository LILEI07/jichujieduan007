package ceshi;/*ceshi
@ClassName：demo08
@Description：test
//
@date：2021/9/5 18:17
@作者：李磊
@Version：21.0*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
shuzu:6~76
shu:3~5;
 */
public class demo08 {
    public static void main(String[] args) {
        int arr[] = new int[8];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(76 - 6 + 1) + 6;
        }
        System.out.println(Arrays.toString(arr));
        while (true) {
            System.out.println("请输入一个[3,5]之间的整数");
            int num = sc.nextInt();
            if (num > 5 || num < 3) {
                System.out.println("您输入的数据有误,请重新输入");
                continue;
            }
            int numarr[] = new int[arr.length];
            int p = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % num == 0) {
                    numarr[p] = arr[i];
                    p++;
                }
            }
            if (p == 0) {
                System.out.println("数组中没有是" + num + "倍数的元素");
            } else {
                System.out.print("数组中是" + num + "倍数的元素有:");
                for (int i = 0; i < numarr.length; i++) {
                    if(numarr[i]==0){
                        break;
                    }
                    System.out.print(+numarr[i]+" ");
                }
                System.out.println();
            }
            break;
        }


    }
}
