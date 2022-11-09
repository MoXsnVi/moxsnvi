package com.itheima;

import java.util.Scanner;

public class qq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入您的选择");
        int number = sc.nextInt();
        switch (number){
            case 1 :
                System.out.println("机票查询");
                break;
            case 2 :
                System.out.println("机票预订");
                break;
            case 3 :
                System.out.println("机票改签");
                break;
            default:
                System.out.println("退出服务");
        }
    }
}