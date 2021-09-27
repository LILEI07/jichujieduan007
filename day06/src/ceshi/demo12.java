package ceshi;/*ceshi
@ClassName：demo12
@Description：test
//
@date：2021/9/5 18:45
@作者：李磊
@Version：21.0*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*shuzu:6~76
        shu:3~5;*/
public class demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(76 - 6 + 1) + 6;
        }
        System.out.println("生成的随机数组是:" + Arrays.toString(arr));
        System.out.println("请输入一个[3,5]之间的随机数:");
        int num = sc.nextInt();
        System.out.print("随机数字中是" + num + "的倍数的元素有:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

    }


}
