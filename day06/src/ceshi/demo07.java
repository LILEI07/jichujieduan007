package ceshi;/*ceshi
@ClassName：demo07
@Description：test
//
@date：2021/9/5 18:13
@作者：李磊
@Version：21.0*/
/*
遍历求二维数组的和
 */
public class demo07 {
    public static void main(String[] args) {
        int [][]arr={{1,2,3,4,5},{4,5,6,7,8,9,8},{8,5,9,6,7,5,2}};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
             sum+=arr[i][j];
            }
        }
        System.out.println("sum:"+sum);
    }
}
