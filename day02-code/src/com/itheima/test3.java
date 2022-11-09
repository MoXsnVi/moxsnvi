package com.itheima;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("分数");
        int number = sc.nextInt();
        if (100 >= number & number >= 0) {
            if (100 >= number & number >= 95) {
                System.out.println("自行车");
            } else if (94 >= number & number >= 90) {
                System.out.println("游乐园");
            } else if (89 >= number & number >= 80) {
                System.out.println("机器人");
            } else if (80 >= number & number >= 0) {
                System.out.println("被打");
            }
        }else
            System.out.println("错误");
    }
}