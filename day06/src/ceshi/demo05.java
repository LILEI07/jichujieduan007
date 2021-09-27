package ceshi;/*ceshi
@ClassName：demo05
@Description：test
//
@date：2021/9/5 16:29
@作者：李磊
@Version：21.0*/
/*
静态初始化二维数组,并求和打印
 */
public class demo05 {
    public static void main(String[] args) {
        int[][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12,13}};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("sum:"+sum);
    }
}
