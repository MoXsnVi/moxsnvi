package com.itheima.demo8;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        int[] arr = {-2, -8, 0, 4, 7, -7, 2};//定义数组
        live(arr);
    }
    public static boolean live(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数,判断其是否存在于数组");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
