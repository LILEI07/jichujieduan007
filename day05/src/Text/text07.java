package Text;/*Text
@ClassName：text07
@Description：test
//
@date：2021/9/4 15:45
@作者：李磊
@Version：21.0*/

/*
方法重载:参数的数量,类型,顺序;
 */
public class text07 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10.5, 80.3));
        System.out.println(sum(10, 50, 60));
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int sum(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

    public static double sum(double a, double b) {
        double c = a + b;
        return c;
    }
}
