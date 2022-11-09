package com.itheima.demo4;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字");
        int number = sc.nextInt();
        int d = number;
        int a = 0;
        while (number !=0) {
            //精华部分
            int ln = number % 10;
            number = number / 10;
            a = a * 10 + ln;
        }
        if (a == d) {
            System.out.println(number);
            System.out.println("是回数");
        } else System.out.println(number);
            System.out.println("不是回数");
    }
}
