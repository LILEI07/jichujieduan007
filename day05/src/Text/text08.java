package Text;/*Text
@ClassName：text08
@Description：test
//
@date：2021/9/4 16:20
@作者：李磊
@Version：21.0*/

/*
同时返回数组的最大值和最小值
 */
public class text08 {
    public static void main(String[] args) {
        int[] array = new int[]{52, 63, 85, 61, 1, 55};
        int[] num = maxandmin(array);
        System.out.println("所给数组的最大值是:" + num[0] + ",最小值是:" + num[1]);
    }

    public static int[] maxandmin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        int[] array = new int[2];
        array[0] = max;
        array[1] = min;
        return array;
    }
}
