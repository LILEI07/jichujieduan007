package shuzu;/*shuzu
@ClassName：text03
@Description：test
@date：2021/9/1 16:43
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

public class text03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr []=new int[6];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第"+(i+1)+"位评委打分:");
            int p=sc.nextInt();
            if(p<1||p>100){
                System.out.println("您输入的数据有误，请重新打分");
                i--;
            }else{
                arr[i]=p;
            }
            }
        int max=arr[0];int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int avg=(sum-min-max)/(arr.length-2);
        System.out.println("评委打分的最高分为："+max+"，最低分为"+min+"，平均分为："+avg);
    }

}
