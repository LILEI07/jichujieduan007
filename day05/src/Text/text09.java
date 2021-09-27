package Text;/*Text
@ClassName：text09
@Description：test
//
@date：2021/9/4 16:34
@作者：李磊
@Version：21.0*/

/*
扩展案例：
        1. 定义一个方法getCount(int[] arr) ，获取一个数组中，小于平均数的元素个数并返回
        2. 在main方法中，生成一个长度为8的随机数组arr，范围是[5,65]
        3. 调用getCount()方法，传递数组，接收并打印结果
 */
public class text09 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            //arr[i]=new Random().nextInt(max-min+1)+min;
            arr[i] = (int) (Math.random() * (65 - 5) + 5);
        }
        int count = getCount(arr);
        System.out.print("数组元素有:[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ]");
        System.out.println("该数组中小于平均数的元素共有" + count + "个,avg:" + getAvg(arr));
    }

    public static int getCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < getAvg(arr)) {
                count++;
            }
        }
        return count;
    }

    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
