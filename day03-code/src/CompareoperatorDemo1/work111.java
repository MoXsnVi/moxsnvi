package CompareoperatorDemo1;

import java.util.Scanner;

public class work111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ge = number % 10;
        System.out.println(ge);
        int shi=number/10%10;
        System.out.println(shi);
        int bai = number / 100;
        System.out.println(bai);
        System.out.println(ge+bai+shi);






    }




}
