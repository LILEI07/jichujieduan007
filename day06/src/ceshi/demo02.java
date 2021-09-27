package ceshi;/*zuoye
@ClassName：demo11
@Description：test
//
@date：2021/9/5 11:22
@作者：李磊
@Version：21.0*/

import java.util.Scanner;

/*
12.完成学生管理系统界面搭建
		提示用户选择功能，可以多次选择：1添加学生 2删除学生 3修改学生 4查询学生 0退出
		使用输出语句，打印用户选择的对应功能(打印文字即可，参考控制台示例)
		使用switch语句完成case的匹配，用户输入0时，退出系统

		控制台示例如下：参考细节，要求效果一致
 */
public class demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("@@@ 欢迎使用黑马学生管理系统 @@@");
            System.out.println("请选择你要使用的功能:1添加学生 2删除学生 3修改学生 4查询学生 0退出");

            System.out.println("请输入您的选择：");
            int p = sc.nextInt();
            if (p < 0 || p > 4) {
                System.out.println("您的选择有误，请重新输入！");
                continue;
            }
            if (p == 0) {
                System.out.println("谢谢使用，程序正在退出...");
                break;
            }
            switch (p) {
                case 1:
                    System.out.println("1添加学生功能...");
                    break;
                case 2:
                    System.out.println("2删除学生功能...");
                    break;
                case 3:
                    System.out.println("3修改学生功能...");
                    break;
                case 4:
                    System.out.println("4查询学生功能...");

                    break;


            }
        }
    }
}
