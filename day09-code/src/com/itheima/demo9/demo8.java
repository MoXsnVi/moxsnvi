package com.itheima.demo9;

import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        //将一个整数放入数组中
        //1978  1 9 7 8 n
        //数组的长度需要知道
        //数组的
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int e =a;

        //计算长度
        int count = 0;
        while (a != 0) {
            a = a / 10;
            count++;
        }
        //新建数组并赋值
        int[] arr = new int[count];
        int l = count - 1;
        while (e != 0) {
            arr [l] = e % 10;
            e = e / 10;
            l--;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }


    }
}
