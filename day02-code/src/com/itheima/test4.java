package com.itheima;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("会员等级");
        int vip = sc.nextInt();
        if (vip == 1) {
            System.out.println("支付九百");
        } else if (vip == 2) {
            System.out.println("支付八百");
        } else if (vip == 3) {
            System.out.println("支付700");
        } else if (vip > 3 | vip < 1) {
            System.out.println("骨折");
        }
    }
}
