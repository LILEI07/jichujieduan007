package shuzu;/*shuzu
@ClassName：text09
@Description：test
//
@date：2021/9/1 19:38
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

public class text09 {
    /*
    评委打分
     */
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第" + (i + 1) + "个评委打分:");
            int p = sc.nextInt();
            if (p > 100 || p < 1) {
                System.out.println("您的评分不正确，请重新输入");
                i--;
            } else {
                arr[i] = p;
                sum = sum + p;
            }
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int avg = (sum - min - max) / (arr.length - 2);
        System.out.println("max:" + max + ",min:" + min + ",avg:" + avg);
    }
}
