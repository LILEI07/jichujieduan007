package com.itheima.jihe;/*com.itheima.jihe
@ClassName：stundent
@Description：test
//
@date：2021/9/10 11:28
@作者：李磊
@Version：21.0*/

public class stundent {
private  String name;
private  int age;
private  String play;

    public stundent() {
    }

    public stundent(String name, int age, String play) {
        this.name = name;
        this.age = age;
        this.play = play;
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

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("stundent{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", play='").append(play).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

