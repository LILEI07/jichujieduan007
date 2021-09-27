package com.mianxinagduixiang.person1;/*com.mianxinagduixiang.person1
@ClassName：Person
@Description：test
//
@date：2021/9/7 18:22
@作者：李磊
@Version：21.0*/

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
    public void shou(){
        System.out.println(name+"....."+age);
    }
}
