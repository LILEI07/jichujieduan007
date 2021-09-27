package yuxizuoye;/*yuxizuoye
@ClassName：demo06
@Description：test
//
@date：2021/9/3 19:43
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
 * 猜数字小游戏(综合案例)
 */
public class demo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int num=(int)(Math.random()*(100-1)+1);
        int num = (int) (Math.random() * (100 - 1) + 1);
        while (true) {
            System.out.println("请输入你要猜的数:");
            int cai = sc.nextInt();
            if (cai < 1 || cai > 100) {
                System.out.println("您输入的数据有误,请重新输入");
            } else if (cai > num) {
                System.out.println("您猜大了,请重新猜!");

            } else if (cai < num) {
                System.out.println("您猜小了,请重新猜!");

            } else {
                System.out.println("恭喜你,猜对了!");
                break;
            }

        }


    }
}
