package com.itheima.demo8;

public class demo6 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3, 9, 0, 8};
        printBig(arr);
    }

    public static int printBig(int[] arr) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (a < arr[i]) {
                a = arr[i];
            }
        }
        System.out.println(a);
        return a;
    }
}
