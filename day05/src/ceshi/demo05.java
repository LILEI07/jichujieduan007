package ceshi;/*zuoye
@ClassName：demo05
@Description：test
//
@date：2021/9/4 18:45
@作者：李磊
@Version：21.0*/

import java.util.Random;

/*
定义数组同时返回最大值和最小值;
 */
public class demo05 {
    public static void main(String[] args) {
        int []arr=new int [5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Random().nextInt(65-5+1)+5;

        }
        int drr[]=getminandmax(arr);
        System.out.print("数组元素有:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("数组的最大值是:"+drr[0]+",数组的最小值是:"+drr[1]);

    }

    public static int [] getminandmax(int arr[]) {
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
           if(min>arr[i]){
               min=arr[i];
           }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int brr[]={max,min};
        return brr;

    }
}
