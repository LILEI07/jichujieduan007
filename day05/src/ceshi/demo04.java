package ceshi;/*zuoye
@ClassName：demo04
@Description：test
//
@date：2021/9/4 18:11
@作者：李磊
@Version：21.0*/

import java.util.Random;

/*        1. 定义一个方法getCount(int[] arr) ，获取一个数组中，小于平均数的元素个数并返回
                2. 在main方法中，生成一个长度为8的随机数组arr，范围是[5,65]
                3. 调用getCount()方法，传递数组，接收并打印结果*/
public class demo04 {
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
