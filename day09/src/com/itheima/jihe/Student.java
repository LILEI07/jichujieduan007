package com.itheima.jihe;/*com.itheima.jihe
@ClassName：Student
@Description：test
//
@date：2021/9/10 14:45
@作者：李磊
@Version：21.0*/

public class Student {
    private String ID;
    private String Name;
    private String Age;
    private String Adress;

    public Student() {
    }

    public Student(String ID, String name, String age, String adress) {
        this.ID = ID;
        Name = name;
        Age = age;
        Adress = adress;
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

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }
}
