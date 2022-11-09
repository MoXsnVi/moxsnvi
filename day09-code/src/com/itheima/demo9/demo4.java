package com.itheima.demo9;

import java.util.Random;

public class demo4 {
    public static void main(String[] args) {
        //开发验证码
        //长度为五
        //前四位是大小写字母
        //最后一位是数字
        Random r = new Random();

        char[] chs = new char[52];//组建字母表
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {//小写
                chs[i] = (char) (97 + i);
            } else if (i > 25 && i < 52) {//大写
                chs[i] = (char) (65 + i - 26);
            }
        }


        String yzm = " ";

        for (int i = 0; i < 4; i++) {
            int rn = r.nextInt(52);
            yzm = yzm + chs[rn];//拼接方法
        }
        int n = r.nextInt(10);
        yzm = yzm + n;
        System.out.print(yzm);

    }
}
