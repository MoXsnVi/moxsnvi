package com.itheima.demo9;

import java.util.Random;

public class demo6 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {//生成随机数参入数组
            arr[i] = r.nextInt(101);
        }
        int a = getA(arr);
        int b = getB(arr);
        int c = getC(arr);
        extracted(a, b, c);

    }

    private static void extracted(int a, int b, int c) {
        int e = c - a - b;
        System.out.println("e" + e);
        e =  (e / 4);


        System.out.println("平均数为" + e);
    }

    private static int getC(int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            c = c + arr[i];
        }
        System.out.println(c);
        return c;
    }

    private static int getB(int[] arr) {
        int b = 100;//求最小值
        for (int i = 0; i < arr.length; i++) {
            if (b > arr[i]) {
                b = arr[i];
            }

        }
        return b;
    }

    private static int getA(int[] arr) {
        int a = 0;//求最大值
        for (int i = 0; i < arr.length; i++) {
            if (a < arr[i]) {
                a = arr[i];
            }

        }
        return a;
    }
}
