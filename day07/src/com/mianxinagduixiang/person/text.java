package com.mianxinagduixiang.person;/*com.mianxinagduixiang.person
@ClassName：text
@Description：test
//
@date：2021/9/7 18:32
@作者：李磊
@Version：21.0*/

public class text {
    public static void main(String[] args) {
        Person s1=new Person("夏诗韵",20,"读书");
        Person s2=new Person("慕容雪痕",21,"弹钢琴");
        Person s3=new Person("燕清舞",18,"跳舞");
        s1.show();
        s2.show();
        s3.show();
        Person[]arr={s1,s2,s3};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge()>=20){
                arr[i].setHobby("敲代码");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
