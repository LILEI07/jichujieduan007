package ceshi;/*ceshi
@ClassName：demo06
@Description：test
//
@date：2021/9/5 18:06
@作者：李磊
@Version：21.0*/

import java.util.Arrays;

/*
数组反转
 */
public class demo06 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        for (int start = 0,end=arr.length-1; start<end; start++,end--) {
            arr[start]=arr[start]^arr[end];
            arr[end]=arr[start]^arr[end];
            arr[start]=arr[start]^arr[end];
        }
        System.out.println(Arrays.toString(arr));

    }
}
