package com.StringText;/*com.StringText
@ClassName：Student
@Description：test
//
@date：2021/9/8 15:40
@作者：李磊
@Version：21.0*/

public class Student {
    private String name;
    private String age;
    private String address;
    private String tel;
    public Student() {
    }

    public Student(String name, String age, String address, String tel) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
