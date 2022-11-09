package com.itheima.demo;

public class demo2 {
    public static void main(String[] args) {
        //先执行.再判断
        int a =0;
        do{
            a=a++;
        }while (
                a>100
        );
    }
}
