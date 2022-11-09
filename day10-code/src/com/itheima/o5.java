package com.itheima;

import java.util.Random;

public class o5 {
    public static void main(String[] args) {
        //打断数组
        //遍历奖池
        Random r = new Random();
        int[] arr = {2, 588, 888, 1000, 10000};
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length-1);
            int a = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
