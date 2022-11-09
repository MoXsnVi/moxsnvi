package com.itheima.demo;

import java.util.Random;

public class demo4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("和为" + sum);
        int p = sum / 10;
        System.out.println("平均数为" + p);
        int a = arr[0];
        int b = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < a) {
                b++;
            }
        }
        System.out.println("有" + b + "个数字比平均值小");
    }
}
