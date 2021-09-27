package ceshi;/*ceshi
@ClassName：demo09
@Description：test
//
@date：2021/9/5 18:38
@作者：李磊
@Version：21.0*/
/*
静态初始化二维数组,并求和打印
 */
public class demo09 {
    public static void main(String[] args) {
        int[][]arr={{31,22,99,4},{56,16,72,83,85},{95,100,1,124,135}};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("sum:"+sum);
    }
}
