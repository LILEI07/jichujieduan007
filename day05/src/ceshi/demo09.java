package ceshi;/*zuoye
@ClassName：demo09
@Description：test
//
@date：2021/9/4 19:14
@作者：李磊
@Version：21.0*/

import java.util.Random;

public class demo09 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(65 - 5 + 1) + 5;
        }
        System.out.print("数组中的元素有[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        System.out.println("数组的平均值是:" + getavg(arr) + ",小于平均值的元素有" + getcount(arr) + "个.");
    }

    public static int getavg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int getcount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < getavg(arr)) {
                count++;
            }
        }
        return count;
    }
}

