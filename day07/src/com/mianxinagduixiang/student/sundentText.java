package com.mianxinagduixiang.student;/*com.mianxinagduixiang.student
@ClassName：sundentText
@Description：test
//
@date：2021/9/7 15:41
@作者：李磊
@Version：21.0*/

public class sundentText {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("李磊");
        s1.setAge(25);
        s1.shou();
        student s2 = new student("王者荣耀", 7);
        s2.shou();

    }
}
