package com.itheima.ceshi;/*com.itheima.ceshi
@ClassName：Student
@Description：test
//
@date：2021/9/10 17:42
@作者：李磊
@Version：21.0*/

public class Student {
    String ID;
    String Name;
    int age;
    String address;

    public Student() {
    }

    public Student(String ID, String name, int age, String address) {
        this.ID = ID;
        Name = name;
        this.age = age;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
