package com.itheima.demo;

import java.util.Random;

public class demo6 {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            int a = r.nextInt();
        }
        int arr1[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);

        }
    }
}
