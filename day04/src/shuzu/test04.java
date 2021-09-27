package shuzu;/*shuzu
@ClassName：test04
@Description：test
@date：2021/9/1 18:15
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
评委打分
 */
public class test04 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第" + (i + 1) + "个评委打分：");
            int p = sc.nextInt();
            if (p < 1 || p > 100) {
                System.out.println("您的打分有误，请重新输入：");
                i--;
            } else {
                arr[i] = p;
                sum += p;
            }
        }
        //获取数组的最值
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
        int avg = (sum - max - min) / (arr.length - 2);
        System.out.print("评委的打分结果为[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        System.out.println("最终结果为：最高分：" + max + ",最低分：" + min + ",平均分:" + avg);
    }
}
