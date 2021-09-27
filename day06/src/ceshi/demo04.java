package ceshi;/*ceshi
@ClassName：demo04
@Description：test
//
@date：2021/9/5 15:57
@作者：李磊
@Version：21.0*/

/*
二维数组
 */
public class demo04 {
    public static void main(String[] args) {
        int[][]arr=new int[3][4];
   //赋值
        arr [0][0]=11;
        arr [0][1]=22;
        arr [0][2]=33;
        arr [0][3]=44;

        arr [1][0]=55;
        arr [1][1]=66;
        arr [1][2]=335;
        arr [1][3]=447;

        arr [2][0]=118;
        arr [2][1]=229;
        arr [2][2]=330;
        arr [2][3]=441;

        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < 4; i1++) {
                System.out.println(arr[i][i1]);
            }
        }



    }
}
