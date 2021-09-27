package com.mianxinagduixiang.student;/*com.mianxinagduixiang.student
@ClassName：Persontext
@Description：test
//
@date：2021/9/7 16:50
@作者：李磊
@Version：21.0*/

public class Persontext {
    public static void main(String[] args) {
        Person s1=new Person("张三",3);
        Person s2=new Person("李四",6);
        Person s3=new Person("王五",9);

        Person[] arr ={s1,s2,s3};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].getAge();
        }
        int avg=sum/arr.length;
        System.out.println("avg:"+avg);


    }

}
