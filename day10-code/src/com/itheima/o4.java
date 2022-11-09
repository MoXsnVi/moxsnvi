package com.itheima;

import java.util.Random;

public class o4 {
    public static void main(String[] args) {
        //先注入5个
        //再去判断
        //如果重复 返回并且重新注入
        Random r = new Random();
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] arr1 = new int[arr.length];

        //生成随机数排列进入数组


            for (int i = 0; i < arr.length;) {
                int x = r.nextInt(5);
                int m =arr[x];
                boolean flag=check(arr1,m);
                if (!flag){
                    arr1[i] =m;
                    i++;
                }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
    }
    //判断数组中是否存在相同的元素

    public static boolean check(int[] arr1, int m) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == m) {
                return true;
            }
        }
        return false;

    }


}
