package Text;/*Text
@ClassName：demo03
@Description：test
//
@date：2021/9/4 10:31
@作者：李磊
@Version：21.0*/
/*
定义一个方法,用来遍历数组
 */
public class demo03 {

    public static void main(String[] args) {

        int[] arr=new int[]{56,88,76,63,20};
        printarray(arr);
    }

    public static void printarray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
