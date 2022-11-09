package com.itheima.arithmeticoperator;
import java.util.Scanner;
public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        //输入一个数
        System.out.println("输入一个三位数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //求个位数
        int ge = number % 10;
        //求十位数
        int shi =number /10 % 10;
        //求百位数
        int bai =number / 100;
        //结果
        System.out.println("个位数为" + ge + ",十位数为" + shi + ",百位数为" + bai );





    }





}
