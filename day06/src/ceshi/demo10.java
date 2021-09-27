package ceshi;/*ceshi
@ClassName：demo10
@Description：test
//
@date：2021/9/5 18:39
@作者：李磊
@Version：21.0*/

import java.util.Arrays;

/*
数组反转
 */
public class demo10 {
    public static void main(String[] args) {
        int []arr=new int []{4,55,69,87,56,95,12};
        for (int i = 0,j= arr.length-1; i<j; i++,j--) {
            int p=arr[i];
            arr[i]=arr[j];
            arr[j]=p;
        }
        System.out.println(Arrays.toString(arr));

    }


}
