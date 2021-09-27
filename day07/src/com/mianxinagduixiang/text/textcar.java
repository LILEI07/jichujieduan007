package com.mianxinagduixiang.text;/*com.mianxinagduixiang.text
@ClassName：textcar
@Description：test
//
@date：2021/9/7 10:41
@作者：李磊
@Version：21.0*/

public class textcar {
    public static void main(String[] args) {
        //创建一个汽车对象c1;
        Car c1 = new Car();
        c1.setBrand("宝马");
        c1.setPrince(200000);
        c1.setColor("黑色");
        System.out.println(c1.getBrand());
        System.out.println(c1.getPrince());
        System.out.println(c1.getColor());
        Car c2=new Car("比亚迪",1222.0,"黄色");
        c2.drive();

    }
}
