package com.mianxinagduixiang.text;/*com.mianxinagduixiang.text
@ClassName：Car
@Description：test
//
@date：2021/9/7 10:40
@作者：李磊
@Version：21.0*/

//创建一个"汽车"类
public class Car {
    //创建成员变量-->汽车的属性
    private String brand;//品牌
    private double prince;//价格
    private String color;//颜色

    public Car() {
    }
    public Car(String brand, Double prince, String color) {
        this.brand = brand;
        this.prince = prince;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //创建成员方法
    public void drive() {
        System.out.println(color + "的" + brand + "车,价值" + prince + "元,在高山速公路上疾驰!");

    }
}
