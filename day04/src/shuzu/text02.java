package shuzu;/*shuzu
@ClassName：text02
@Description：test
@date：2021/9/1 16:23
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

public class text02 {
    public static void main(String[] args) {
        int[] arr = {125, 84, 99, 25, 885, 72};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查询的数：");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("您输入的数在数组中不存在！");
        } else {
            System.out.println("您输入的数在数组中的索引是" + index);
        }
    }
}
