package com.itheima.jihe;/*com.itheima.jihe
@ClassName：Teacher
@Description：test
//
@date：2021/9/10 14:10
@作者：李磊
@Version：21.0*/

public class Teacher {
    private  String name;
    private  int age;
    private  String haihao;

    public Teacher() {
    }

    public Teacher(String name, int age, String haihao) {
        this.name = name;
        this.age = age;
        this.haihao = haihao;
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

    public String getHaihao() {
        return haihao;
    }

    public void setHaihao(String haihao) {
        this.haihao = haihao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teacher{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", haihao='").append(haihao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
