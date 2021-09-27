package com.itheima.jihe;/*com.itheima.jihe
@ClassName：Teacherdemo
@Description：test
//
@date：2021/9/10 14:12
@作者：李磊
@Version：21.0*/
/*集合元素的筛选:
        定义一个方法,接收一个装着老师对象的集合
        方法完成筛选年龄低于28的老师,存入另一个新集合,并返回
        main方法中,完成以下需求:
        实例化三个老师对象,装入合适的集合
        测试方法,接收返回值并遍历*/
import java.util.ArrayList;

public class Teacherdemo {
    public static void main(String[] args) {
        ArrayList<Teacher> arr=new ArrayList<>();
        Teacher s1=new Teacher("张三",26,"教数学");
        Teacher s2=new Teacher("王五",27,"教英语");
        Teacher s3=new Teacher("赵六",28,"教化学");
        Teacher s4=new Teacher("周期",29,"教物理");
        Teacher s5=new Teacher("宋八",24,"教生物");
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);
        ArrayList shaixuan = shaixuan(arr);
        for (int i = 0; i < shaixuan.size(); i++) {
            System.out.println(shaixuan.get(i));
        }
    }

    public static ArrayList <Teacher> shaixuan(ArrayList<Teacher>  arr) {
        ArrayList <Teacher> arr1=new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getAge()<28){
               arr1.add(arr.get(i));
            };
        }
        return arr1;
    }
}
