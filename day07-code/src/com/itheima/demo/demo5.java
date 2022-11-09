package com.itheima.demo;

import java.util.Random;

public class demo5 {
    public static void main(String[] args) {
        Random r = new Random();
        //定义数组
        int arr[] = new int[5];
        //随机生成的值赋给数组
        int a = 4;
        int arr1[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(11);
            arr[a] = arr[i];
            System.out.println(arr[i]);
            a--;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);

        }
    }
}
