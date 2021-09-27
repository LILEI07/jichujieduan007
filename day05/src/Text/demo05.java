package Text;/*Text
@ClassName：demo05
@Description：test
//
@date：2021/9/4 11:29
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
课堂案例：
        设计一个计算器，可以进行四则运算
        用户选择加、减、乘、除，输入两个整数，打印结果
    控制台示例：
        请选择运算方式[1加法 2减法 3乘法 4除法 0退出]：
        1
        请输入第一个整数：
        10
        请输入第二个整数：
        20
        用户选择加法
        10 + 20 = 30
        请选择运算方式[1加法 2减法 3乘法 4除法 0退出]：
        3
        请输入第一个整数：
        4
        请输入第二个整数：
        4
        用户选择乘法
        4 * 4 = 16
 */
public class demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择运算方式[1加法 2减法 3乘法 4除法 0退出]：");
            int yunsuanfangfa = sc.nextInt();
            if (yunsuanfangfa == 0) {
                System.out.println("系统正在退出....");
                System.exit(0);
            } else if (yunsuanfangfa < 0 || yunsuanfangfa > 4) {
                System.out.println("您输入的数据有误,请重新输入!");
                continue;
            }
            System.out.println("请输入第一个整数：");
            int num1 = sc.nextInt();
            System.out.println("请输入第一个整数：");
            int num2 = sc.nextInt();
            switch (yunsuanfangfa) {
                case 1:
                    jiafa(num1, num2);
                    break;
                case 2:
                    jianfa(num1, num2);
                    break;
                case 3:
                    chengfa(num1, num2);
                    break;
                case 4:
                    chufa(num1, num2);
                    break;
            }
        }
    }

    public static void jiafa(int a, int b) {
        int c = a + b;
        System.out.println("用户选择加法");
        System.out.println("a" + "+" + "b" + "=" + (a + b));
    }

    public static void jianfa(int a, int b) {
        int c = a - b;
        System.out.println("用户选择减法");
        System.out.println("a" + "-" + "b" + "=" + (a - b));
    }

    public static void chengfa(int a, int b) {
        int c = a * b;
        System.out.println("用户选择乘法");
        System.out.println("a" + "*" + "b" + "=" + (a * b));
    }

    public static void chufa(int a, int b) {
        int c = a / b;
        System.out.println("用户选择除法");
        System.out.println("a" + "/" + "b" + "=" + (a / b));
    }
}
