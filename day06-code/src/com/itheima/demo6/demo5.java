package com.itheima.demo6;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("正整数");
        int a = sc.nextInt();
        if (a == 1 || a == 2) {
            System.out.println("质数");
        } else
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    System.out.println("是合数");
                    break;
                } else
                    System.out.println("素数");
                break;
            }
    }
}
