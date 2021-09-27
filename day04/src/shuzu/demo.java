package shuzu;/*
shuzu
@ClassName：demo
@Description：test
@date：2021/9/1 12:45
@Version：1.0
*/

public class demo {
    public static void main(String[] args) {
        //动态初始化一个数组；
        int arr[] = new int[5];
        //打印数组；
        System.out.println(arr);
        //数组赋值；
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 123;
        arr[3] = 1345;
        arr[4] = 14567;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }


}
