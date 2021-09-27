package yuxizuoye;/*yuxizuoye
@ClassName：demo09
@Description：test
//
@date：2021/9/3 20:21
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
 评委打分案例(综合案例)
 */
public class demo09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[6];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第"+(i+1)+"位评委打分");
            int p=sc.nextInt();
            if(p<0||p>100)
            {
                System.out.println("您的打分有误,请重新打分!");
                i--;
            }else{
                arr[i]=p;
                sum+=p;
            }
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

        int avg=(sum-max-min)/(arr.length-2);
        System.out.println("sum:"+sum+",min"+min+",max:"+max+",avg:"+avg);
    }
}
