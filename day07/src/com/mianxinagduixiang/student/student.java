package com.mianxinagduixiang.student;/*com.mianxinagduixiang.student
@ClassName：student
@Description：test
//
@date：2021/9/7 15:41
@作者：李磊
@Version：21.0*/

public class student {
    private String name;
    public int age;

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void shou() {
        System.out.println(name + "在睡觉");
    }
}
