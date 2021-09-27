package com.itheima.ceshi;/*com.itheima.ceshi
@ClassName：StudentManager
@Description：test
//
@date：2021/9/10 17:45
@作者：李磊
@Version：21.0*/

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        ArrayList arr0 = new ArrayList();
        ArrayList arr1 = new ArrayList();
        ArrayList arr2 = new ArrayList();

        Scanner sc = new Scanner(System.in);
        float f=5.4f;
        while (true) {
            System.out.println("* * * 欢迎来到学生管理系统 * * *");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查询学生");
            System.out.println("0 退出系统");
            System.out.println("请选择您要进行的操作!");
            int p = sc.nextInt();
            switch (p) {
                case 1 -> {
                    System.out.println("* * * * * * * * * * * *");
                    System.out.println("      【添加学生】");
                    addStundent(arr, sc);
                }
                case 2 -> {
                    System.out.println("* * * * * * * * * * * *");
                    System.out.println("      【删除学生】");
                    DelStudent(sc, arr);
                }
                case 3 -> {
                    System.out.println("* * * * * * * * * * * *");
                    System.out.println("      【修改学生】");
                    XiugaiStudent(sc, arr);
                }
                case 4 -> {
                    System.out.println("* * * * * * * * * * * *");
                    System.out.println("      【查询学生】");
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
            System.out.println("系统中还没有学生，请先去添加！");
            return;
        }
        while (true) {
            System.out.println("请输入学号");
            String id = sc.next();
            int index = getid(arr, id);
            if (index == -1) {
                System.out.println("查无此人学号，请重新输入！");
            } else {
                Student stu = shuru(id, sc);
                arr.set(index, stu);
                System.out.println("学生修改成功");
                break;
            }
        }
    }

    public static void DelStudent(Scanner sc, ArrayList<Student> arr) {
        if (arr.isEmpty()) {
            System.out.println("系统中还没有学生，请先去添加！");
            return;
        }
        while (true) {
            System.out.println("请输入学号");
            String id = sc.next();
            int index = getid(arr, id);
            if (index == -1) {
                System.out.println("查无此人，请重新输入！");
            } else {
                arr.remove(index);
                System.out.println("学生删除成功");
                break;
            }
        }
    }

    public static void findStudent(ArrayList<Student> arr) {
        if (arr.isEmpty()) {
            System.out.println("系统中还没有学生，请先去添加！");
            return;
        }
        System.out.println("学号    姓名    年龄    住址");
        for (Student student : arr) {
            System.out.println(student.ID + "   " + student.Name + "   " + student.getAddress() + "   " + student.getAddress());
        }
    }

    public static void addStundent(ArrayList<Student> arr, Scanner sc) {
        while (true) {
            System.out.println("请输入学号");
            String id = sc.next();
            int index = getid(arr, id);
            if (index == -1) {
                Student stu = shuru(id, sc);
                arr.add(stu);
                System.out.println("学生添加成功");
                break;
            } else {
                System.out.println("学号已被占用，请重新输入！");
            }
        }
    }

    public static Student shuru(String id, Scanner sc) {
        System.out.println("请输入名字：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入住址：");
        String address = sc.next();
        return new Student(id, name, age, address);
    }

    public static int getid(ArrayList<Student> arr, String id) {
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getID().equals(id)) {
                index = i;
            }
        }
        return index;
    }
}
