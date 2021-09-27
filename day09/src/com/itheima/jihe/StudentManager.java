package com.itheima.jihe;/*com.itheima.jihe
@ClassName：StudentManager
@Description：test
//
@date：2021/9/10 14:48
@作者：李磊
@Version：21.0*/

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        while (true) {
            System.out.println("* * *  欢迎来到学生管理系统  * * *");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查询学生");
            System.out.println("0 退出系统");
            System.out.println("请选择您要进行的操作!");
            int p = sc.nextInt();
            switch (p) {
                case 1 -> {
                    System.out.println("* * * * * * * *");
                    System.out.println("    添加学生");
                    addStundent(arr, sc);
                }
                case 2 -> {
                    System.out.println("* * * * * * * *");
                    System.out.println("    删除学生");
                    DelStudent(sc, arr);
                }
                case 3 -> {
                    System.out.println("* * * * * * * *");
                    System.out.println("    修改学生");
                    XiugaiStudent(sc, arr);
                }
                case 4 -> {
                    System.out.println("* * * * * * * *");
                    System.out.println("    查询学生");
                    findStudent(arr);
                }
                case 0 -> {
                    System.out.println("谢谢使用,正在退出....");
                    System.exit(0);
                }
                default -> System.out.println("您的输入有误,新的功能正在开发,请重新输入!");
            }
        }
    }

    private static void XiugaiStudent(Scanner sc, ArrayList<Student> arr) {
        if (arr.isEmpty()) {
            System.out.println("当前系统没有学生,请先去添加");
            return;
        }
        while (true) {
            System.out.println("请输入要修改的学生的学号:");
            String id = sc.next();
            int index = -1;
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getID().equals(id)) {
                    index = i;
                }
            }
            if (index == -1) {
                System.out.println("没有要修改的学生,请重新输入");
            } else {
                System.out.println("请输入姓名");
                String Name = sc.next();
                System.out.println("请输入年龄");
                String Age = sc.next();
                System.out.println("请输入住址");
                String Address = sc.next();
                Student S1 = new Student(id, Name, Age, Address);
                arr.set(index, S1);
                System.out.println("修改成功");
                break;
            }
        }
    }

    private static void DelStudent(Scanner sc, ArrayList<Student> arr) {
        if (arr.isEmpty()) {
            System.out.println("当前系统没有学生,请先去添加");
            return;
        }
        while (true) {
            System.out.println("请输入要删除的学生的学号:");
            String id = sc.next();
            int index = -1;
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getID().equals(id)) {
                    index = i;
                }
            }
            if (index == -1) {
                System.out.println("您要删除的学号不存在,请重新输入");
                break;
            } else {
                arr.remove(index);
                System.out.println("删除成功!");
            }
        }
    }

    public static void findStudent(ArrayList<Student> arr) {
        if (arr.isEmpty()) {
            System.out.println("系统中还没有学生,请先去添加");
            return;
        } else {
            System.out.println("学号:    姓名:    年龄:    住址:");
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i).getID() + "    " + arr.get(i).getName() + "    " + arr.get(i).getAge() + "    " + arr.get(i).getAdress());
            }
        }
    }

    public static void addStundent(ArrayList<Student> arr, Scanner sc) {
        while (true) {
            System.out.println("请输入学号");
            String id = sc.next();
            int index = -1;
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getID().equals(id)) {
                    index = i;
                }
            }
            if (index != -1) {
                System.out.println("您输入的学号已被占用,请重新输入!");
                continue;
            }
            System.out.println("请输入姓名");
            String Name = sc.next();
            System.out.println("请输入年龄");
            String Age = sc.next();
            System.out.println("请输入住址");
            String Address = sc.next();
            Student S1 = new Student(id, Name, Age, Address);
            arr.add(S1);
            System.out.println("添加成功");
            break;
        }
    }
}
