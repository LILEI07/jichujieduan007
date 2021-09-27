package com.mianxinagduixiang.person;/*com.mianxinagduixiang.person
@ClassName：person
@Description：test
//
@date：2021/9/7 18:29
@作者：李磊
@Version：21.0*/

public class Person {
    private String name;
    private int age;
    private String hobby;

    public Person() {
    }

    public Person(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public void show(){
        System.out.println(name+"...."+age+"...."+hobby+"....");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
