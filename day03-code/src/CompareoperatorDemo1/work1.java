package CompareoperatorDemo1;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入一个整数
        int number1 = sc.nextInt();
        //输入另一个整数
        int number2 = sc.nextInt();

        //结果
        System.out.println(number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0);

    }
}
