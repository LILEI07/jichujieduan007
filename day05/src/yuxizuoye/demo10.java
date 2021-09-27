package yuxizuoye;/*yuxizuoye
@ClassName：demo10
@Description：test
//
@date：2021/9/3 20:35
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
 * 带参的方法：打印n-m之间的所有奇数
 * 带参带返回值的方法：获取指定数组中的最大值，并返回
 */
public class demo10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要检索奇数打印的范围的开始值");
        int start= sc.nextInt();
        System.out.println("请输入要检索奇数打印的范围的终止值");
        int end= sc.nextInt();
        sumjishu(start,end);

        int []array=new int [5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("请为数组的第"+(i+1)+"个元素赋值:");
            array[i]= sc.nextInt();
        }
        System.out.println("您所给的数组中的最大值是"+arrmax(array));
    }
    public static void sumjishu(int n, int m) {
        System.out.print("[ " + n + "~" + m + " ]之间的所有奇数有:" + "[ ");
        for (int i = n; i < m; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("]");
    }
    public static int arrmax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
