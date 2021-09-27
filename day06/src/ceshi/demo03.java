package ceshi;/*ceshi
@ClassName：demo03
@Description：test
//
@date：2021/9/5 15:34
@作者：李磊
@Version：21.0*/

import java.util.Arrays;

/*
反转数组
 */
public class demo03 {
    public static void main(String[] args) {
        int []arr= {5,6,9,55,7,88,99,65,84,25,69};
        for(int start=0, end=arr.length-1;start<end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,5));


    }
}
