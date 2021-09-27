package yuxizuoye;/*yuxizuoye
@ClassName：demo08
@Description：test
//
@date：2021/9/3 20:15
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
 元素的基本查找，如果找到了获取该元素在数组中的索引，找不到打印-1
 */
public class demo08 {
    public static void main(String[] args) {
        int arr[]=new int[]{89,65,23,55,60,88};
        System.out.println("请输入你要查找的值:");
        int num=new Scanner(System.in).nextInt();
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                index=i;
            }
        }
        if(index==-1){
            System.out.println("您要查找的数值在数组中不存在!");
        }else{
            System.out.println("恭喜!已查到该数字,它在数组中的索引是:"+index);
        }

    }
}
