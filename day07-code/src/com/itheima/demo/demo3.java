package com.itheima.demo;

public class demo3 {
    public static void main(String[] args) {
        //初始化值一定要是数组中的值
        int arr[] = {-33, 5, 22, 84, -55};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
