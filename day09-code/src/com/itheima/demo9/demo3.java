package com.itheima.demo9;

public class demo3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum++;
                System.out.println(i);
            }

        }
        System.out.println("有" + sum + "个质数");

    }
}


