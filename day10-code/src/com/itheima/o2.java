package com.itheima;

import java.util.Scanner;

public class o2 {
    public static void main(String[] args) {
        //输入数字
        //请输入密码
//        5080305
//        0585350
        //进程已结束，退出代码为 0
        System.out.println("请输入加密码");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int e = a;

        //计算长度
        int count = 0;
        while (a != 0) {
            a = a / 10;
            count++;
        }
        int sum =count;
        //新建数组并赋值
        int[] arr = new int[count];
        int l = count - 1;
        while (e != 0) {
            arr[l] = e % 10;
            e = e / 10;
            l--;

        }

        //解密
        //反转
        int[] arr2 = new int[arr.length];
        for (int i = 0, l2 = arr.length - 1; i < arr2.length; i++, l2--) {
            arr2[i] = arr[l2];

        }

        //
        int[] arr3 = new int[count];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = arr2[i] + 10;
            arr3[i] = arr3[i] - 5;
            if (arr3[i] >= 10) {
                arr3[i] -= 10;
            }
        }



        //打印
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr3[i] + "***");
        }
    }
}
