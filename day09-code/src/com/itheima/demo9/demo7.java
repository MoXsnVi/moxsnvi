package com.itheima.demo9;

public class demo7 {
    public static void main(String[] args) {
        //定义数组
        //遍历数组
        //+5 %10
        //反转 填入数组
        int []arr1={1,9,8,3};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr1[i]+5;
            arr1[i]=arr1[i]%10;
        }
        int[] arr2=new int[arr1.length];

        for (int i = 0, a= arr1.length-1; i < arr2.length; i++,a--) {
            arr2[i]=arr1[a];

        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] +" ");
        }
    }
}
