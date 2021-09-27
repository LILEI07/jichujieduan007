package shuzu;/*shuzu
@ClassName：test05
@Description：test
//
@date：2021/9/1 18:45
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

public class test05 {
    /*
    查找数组元素，并返回查找结果
     */
    public static void main(String[] args) {
        int[] arr = new int[]{85, 65, 84, 23, 12};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查找的数：");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("已查找到你要找的数！");
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("数组中没有您要查找的数！");
        } else {
            System.out.println("您要查找的数在数组中的索引为" + index);
        }
    }
}
