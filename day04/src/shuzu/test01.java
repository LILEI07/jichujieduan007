package shuzu;/*shuzu
@ClassName：test01
@Description：test
@date：2021/9/1 15:27
@Version：1.0*/

public class test01 {
    //静态初始化数组，并求和；求数组最大值；
    public static void main(String[] args) {
        int[] arr = new int[]{56, 89, 82, 74, 56, 23};
        int sum = 0;
        //将第一个元素赋值给max和min；
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("sum:" + sum + ",max:" + max + "min:" + min);
    }
}
