package com.itheima.demo9;

public class demo5 {
    public static void main(String[] args) {
        int[]arr1={1,2,4,5,7,8,};
        int[]arr2=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }
}
