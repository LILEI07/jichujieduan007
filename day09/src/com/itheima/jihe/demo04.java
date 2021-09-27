package com.itheima.jihe;/*com.itheima.jihe
@ClassName：demo04
@Description：test
//
@date：2021/9/10 11:51
@作者：李磊
@Version：21.0*/

import java.util.ArrayList;
import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        ArrayList <stundent>arr=new ArrayList<>();
        arr.add(extracted());
        arr.add(extracted());
        arr.add(extracted());
        System.out.println(arr);

    }

    private static stundent extracted() {
        stundent s1 = new stundent();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生名称:");
        s1.setName(sc.nextLine());
        System.out.println("请输入学生年龄:");
        s1.setAge(sc.nextInt());
        return s1;
    }
}
