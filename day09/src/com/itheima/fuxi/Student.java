package com.itheima.fuxi;/*com.itheima.fuxi
@ClassName：Student
@Description：test
//
@date：2021/9/11 13:42
@作者：李磊
@Version：21.0*/

class test {
    public static void main(String[] args) {

        String a = new String("abc");
        String a1 = new String("abc");
        System.out.println(a == a1);
        System.out.println(a.equals(a1));
        short h = 1;
        h = (short) (h + 1);
        int b = 1;
        double c = b;
        int[] arr = new int[5];
        System.out.println(arr);
    }
}
