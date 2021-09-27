package com.text2;/*com.text2
@ClassName：demo05
@Description：test
//
@date：2021/9/8 18:31
@作者：李磊
@Version：21.0*/

/*
将int数组中的内容,按照规定的格式拼接输出!
 */
public class demo05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        //[1, 2, 3, 4, 5]
        // String shuchu = shuchu(arr);
        String s = shuchu1(arr);
        System.out.println(s);
    }

    public static String shuchu(int[] arr) {
        String ss = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                ss = ss + "[" + arr[0] + ",";
            } else if (i == arr.length - 1) {
                ss = ss + " " + arr[i] + "]";
            } else {
                ss = ss + " " + arr[i] + ",";
            }
        }
        return ss;
    }

    public static String shuchu1(int[] arr) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                s.append("[").append(arr[i]).append(", ");
            } else if (i == arr.length - 1) {
                s.append(arr[i]).append("]");
            } else {
                s.append(arr[i]).append(", ");
            }
        }
        return s.toString();

    }
}
