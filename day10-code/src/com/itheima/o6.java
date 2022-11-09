package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class o6 {
    public static void main(String[] args) {
        //吐了🤮...........

        //随机生成数组 6 单独带一个数字篮球
        Random r = new Random();

        //红色球号码 不能重复!!
        int[] red = new int[6];
        for (int i = 0; i < red.length; ) {
            int n = r.nextInt(33) + 1;
            boolean flag = check(red, n);
            if (!flag) {
                red[i] = n;
                i++;
            }
        }
        //蓝色球号码
        int blue = r.nextInt(33) + 1;
        System.out.println("蓝色"+blue);

        //遍历红色球号码
        for (int i = 0; i < red.length; i++) {
            System.out.println(red[i]);
        }

        //用户输入红色猜奖号码
        int[] guessRed = new int[6];
        for (int i = 0; i < guessRed.length; i++) {
            System.out.println("请输入第" + i + 1 + "位红球号码 不可重复");
            Scanner sc = new Scanner(System.in);
            guessRed[i] = sc.nextInt();
        }

        //用户输入蓝色猜奖号码
        System.out.println("请输入蓝色球号码");
        Scanner sc = new Scanner(System.in);
        int gBlue = sc.nextInt();

        //对比判断
        //判断红色
        int redSum = 0;
        for (int i = 0; i < guessRed.length; i++) {
            int a = guessRed[i];
            boolean flag1 = check(red, a);
            if (flag1) {
                redSum++;
            }
        }

        //判断蓝色
        int sumBlue = 0;
        if (gBlue == blue) {
            sumBlue++;
        }
        //计算类型
        //六个红色中了
        if (redSum == 6) {
            if (sumBlue == 1) {
                System.out.println("你中了1000万元!");
            } else if (sumBlue == 0) {
                System.out.println("你中了500万元!");
            }
            //五个红色
        } else if (redSum == 5) {
            if (sumBlue == 1) {
                System.out.println("你中了3000元!");
            } else if (sumBlue == 0) {
                System.out.println("你中了500元!");
            }
            //四个红色
        } else if (redSum == 4) {
            if (sumBlue == 1) {
                System.out.println("你中了200元!");
            } else if (sumBlue == 0) {
                System.out.println("你中了10元!");
            }
        } else if (redSum == 3) {
            if (sumBlue == 1) {
                System.out.println("你中了10元!");
            }
        }
        if (redSum <= 2 && sumBlue == 1) {
            System.out.println("你中了5元!");

        }else System.out.println(" 谢谢参与!");
    }
    //判断重复
    public static boolean check(int[] arr1, int n) {
        for (int i3 = 0; i3 < arr1.length; i3++) {
            if (arr1[i3] == n) {
                return true;
            }
        }
        return false;
    }
}