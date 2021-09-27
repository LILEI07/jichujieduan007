package com.itheima.jihe;/*com.itheima.jihe
@ClassName：demo02
@Description：test
//
@date：2021/9/10 10:45
@作者：李磊
@Version：21.0*/

import java.util.ArrayList;

public class demo02 {
    public static void main(String[] args) {
        //集合的增删改查
        ArrayList<String> arr=new ArrayList();
        arr.add("java");
        arr.add("php");
        arr.add("c++");
        //删
        arr.remove("php");
        //改
        arr.set(1,"c++");
        //查
        String s=arr.get(0);
        System.out.println(s);
        System.out.println(arr);

    }
}
