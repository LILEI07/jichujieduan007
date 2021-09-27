package yuxizuoye;/*yuxizuoye
@ClassName：demo03
@Description：test
//
@date：2021/9/3 19:27
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
考试奖励(if语句)
 */
public class demo03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的成绩");
        int num=sc.nextInt();
        if(num>80&&num<=100){
            System.out.println("优秀,奖励你一个媳妇");
        }else if(num>60&&num<=79){
            System.out.println("及格,奖励你吃一顿");
        }else{
            System.out.println("不及格,奖励你饿十天");
        }

    }



}
