package yuxizuoye;/*yuxizuoye
@ClassName：demo07
@Description：test
//
@date：2021/9/3 20:05
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
 * 求自定义数组的最值(最大值、最小值)
 */
public class demo07 {
    public static void main(String[] args) {
        int [] arr=new int [5];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请为数组第"+(i+1)+"个元素赋值:");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("max:"+max+",min:"+min);

    }





}
