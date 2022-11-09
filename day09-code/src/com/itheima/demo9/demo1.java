package com.itheima.demo9;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("机票原价");
        int price = sc.nextInt();
        System.out.println("月份");
        int month = sc.nextInt();
        System.out.println("输入等级1经济/2头等");
        int level = sc.nextInt();

        if (month <= 10 && month >= 5) {
            price = getPrice(price, level, 0.86, 0.563);
            System.out.println(price);

        } else if (month >= 1 && month <= 12) {
            price = getPrice(price, level, 0.45, 0.43);
            System.out.println(price);

        } else {
            System.out.println("错误");
        }
    }

    private static int getPrice(int price, int level, double v, double v2) {
        if (level == 1) {
            price = (int) (price * v);
        } else if (level == 2) {
            price = (int) (price * v2);
        } else {
            System.out.println("没有这个舱位");
        }
        return price;
    }

//    public static int getPp(int price, int level, double a, double b) {
//        if (level == 1) {
//            price = (int) (price * a);
//        } else if (level == 2) {
//            price = (int) (price * b);
//        } else {
//            System.out.println("没有这个舱位");
//        }
//        return price;
//
//    }
}



