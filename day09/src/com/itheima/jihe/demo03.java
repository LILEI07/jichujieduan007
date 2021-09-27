package com.itheima.jihe;/*com.itheima.jihe
@ClassName：demo03
@Description：test
//
@date：2021/9/10 11:28
@作者：李磊
@Version：21.0*/

import java.util.ArrayList;

/*

 */
public class demo03 {
    public static void main(String[] args) {
        ArrayList<stundent> arr = new ArrayList<>();
        stundent s1 = new stundent("王刚", 46, "读课文");
        stundent s2 = new stundent("刘立新", 66, "教化学");
        stundent s3 = new stundent("邓宁刚", 35, "教数学");
        stundent s4 = new stundent("冯小鹏", 45, "凉凉子");
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i).getAge();
        }

        System.out.println(sum);

    }

}
