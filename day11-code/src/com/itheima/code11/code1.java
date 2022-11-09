package com.itheima.code11;

public class code1 {
    public static void main(String[] args) {
        //二维数组
        //数据类型[][]数组名=new 数据类型][[]{{元素1,元素2},{元素1,元素2}};
        //简化
        int[][] arr1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6, 7}
        };
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr1[i].length; i1++) {
                System.out.print(arr1[i][i1] +" ");
            }
            System.out.println();

        }



    }
}
