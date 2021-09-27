package shuzu;/*shuzu
@ClassName：text01_03
@Description：test
@date：2021/9/1 17:42
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
数组求和并求最大值，最小值：
 */
public class text01_03 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        //为数组赋值，并求和；
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请为第" + (i + 1) + "个元素赋整数值：");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        //遍历数组求最大值和最小值；
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        //输出数组并打印最大值和最小值与数组和；
        System.out.print("数组中的元素有[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i == arr.length - 1) {
                System.out.println("]");
            }
        }
        //打印结果
        System.out.println("上面数组的和为：" + sum + ",最大值为：" + max + ",最小值为：" + min);
    }
}
