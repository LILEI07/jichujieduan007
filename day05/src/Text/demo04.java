package Text;/*Text
@ClassName：demo04
@Description：test
//
@date：2021/9/4 10:50
@作者：李磊
@Version：21.0*/

/*
打印[n,m]之间的所有奇数
 */
public class demo04 {
    public static void main(String[] args) {
        printnum(10, 30);
    }

    public static void printnum(int n, int m) {
        if (n < m) {
            for (int i = n; i < m; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("您输入的数据有误!");
        }
    }
}
