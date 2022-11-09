package com.itheima.demo;

public class test1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int a = 4;
        int arr1[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr1[a] = arr[i];
            System.out.println("+"+arr[i]);
            System.out.println("@"+arr1[a]);
            a--;
        }
    }
}
