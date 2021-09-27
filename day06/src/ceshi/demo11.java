package ceshi;/*ceshi
@ClassName：demo11
@Description：test
//
@date：2021/9/5 18:43
@作者：李磊
@Version：21.0*/
/*
遍历求二维数组的和
 */
public class demo11 {
    public static void main(String[] args) {
        int [][]arr={{21,22,32,44,51},{42,35,65,75,88,19,81},{28,25,39,36,57,15,12}};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("sum:"+sum);
    }
}
