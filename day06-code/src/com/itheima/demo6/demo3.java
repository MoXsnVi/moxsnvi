package com.itheima.demo6;

public class demo3 {
    public static void main(String[] args) {
        //敲七
        //包含7 7的倍数
        //打印1-100之间的过得数字
        for (int i = 1; i <= 100; i++) {
            int b = i % 10;//7
            int c = i / 10 % 10;//7
            int d = i % 100;//0
            int e = i % 7;//0
            if (b == 7 || c == 7 || d == 0 || e == 0) {
                System.out.println("过");
                continue;
            }else
            System.out.println(i);

        }

    }
}
