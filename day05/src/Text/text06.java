package Text;/*Text
@ClassName：text06
@Description：test
//
@date：2021/9/4 14:40
@作者：李磊
@Version：21.0*/
/*
返回一个int数组中的最大值
 */
public class text06 {
    public static void main(String[] args) {
        int max = getmax(new int[]{5, 3, 6, 9, 8, 5, 4, 5556,});
        System.out.println(max);
    }

    public static int getmax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
