package com.itheima;

import java.util.Scanner;

public class o1 {
    public static void main(String[] args) {
        //输入数字
        System.out.println("请输入密码");
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

        //加密
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;
            arr[i]=arr[i]%10;
        }
        int[] arr2=new int[arr.length];

        for (int i = 0, l2= arr.length-1; i < arr2.length; i++,l2--) {
            arr2[i]=arr[l2];

        }


        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }





    }
}
