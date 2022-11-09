package com.itheima.demo8;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        getSum(a, b);
    }

    public static void getSum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
}
