package shuzu;/*shuzu
@ClassName：text06_08
@Description：test
//
@date：2021/9/1 19:23
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
数组的定义、赋值、求和、最大值、最小值
 */
public class text06_08 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请为第" + (i + 1) + "个元素赋值！");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        /*
        定义求和变量
         */
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max:" + max + ",min:" + min + ",sum:" + sum);
    }

}
