package CompareoperatorDemo1;

import java.util.Scanner;

public class CompareoperatorDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("您的时髦程度");
        int me = sc.nextInt();
        System.out.println("您约会对象的时髦程度");
        int she = sc.nextInt();
        System.out.println("约会结果为");
        boolean result = me > she;
        System.out.println(result);
    }
}
