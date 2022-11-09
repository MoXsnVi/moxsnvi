package com.itheima.demo6;

import java.util.Random;
import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100);
        for(;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入一个数字");
            int b = sc.nextInt();
            if (b < a) {
                System.out.println("小");
            } else if (b > a) {
                System.out.println("大");
            } else if (b == a) {
                System.out.println("中");
                break;
            }
        }

    }
}
