package com.itheima.demo;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入被除数");
        int a = sc.nextInt();
        System.out.println("输入除数");
        int b = sc.nextInt();
        int sum = 0;
        if (a > 0 && b > 0) {
            while (a >= b) {
                a = (a - b);
                sum = sum + 1;
            }
            System.out.println("商为" + sum + ";余数为" + a);
        } else System.out.println("您录入的数字不是正数");
    }
}
