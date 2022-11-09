package com.itheima.demo4;

import java.util.Scanner;

public class DZD1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入范围");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a < b ? a : b; i <= (a > b ? a : b); i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum = sum + 1;
            }
        }
        System.out.println(sum);

    }
}
