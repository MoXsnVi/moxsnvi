package com.itheima.demo8;

public class demo8 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 4, 6, 9, 4, 2, 6, 8, 3, 1, 4, 7};
        int[] copyArr = copyOfRange(arr, 2, 9);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {//方法 需return
        int[] arr1 = new int[to - from];
        for (int i = 0; i < arr1.length; i++) {
            if (from < to) {
                arr1[i] = arr[from];
                from++;
            }
        }
        return arr1;
    }
}

