package com.itheima;

/*
水仙花数
 */
public class Demo03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + bai * bai * bai + shi * shi * shi == i) {
                System.out.print(i + " ");
                count++;
                if (count % 2 == 0) {
                    System.out.println();
                }
            }
        }
    }

}
