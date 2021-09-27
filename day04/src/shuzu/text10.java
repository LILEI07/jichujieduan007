package shuzu;
/*shuzu
@ClassName：text10
@Description：test
//
@date：2021/9/1 20:19
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

public class text10 {
    /*
查找数组中的元素
 */
    public static void main(String[] args) {
        int[] arr = new int[]{69, 88, 66, 32, 66, 54};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查的元素：");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("数组中没有您要查询的数");
        } else {
            System.out.println("已查到，你要查的数在数组中索引是" + index);
        }
    }
}
