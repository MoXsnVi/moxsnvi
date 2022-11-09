package CompareoperatorDemo1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a > b ? a : b;
        System.out.println(d > c ? d : c);


    }
}