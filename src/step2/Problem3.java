package step2;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        boolean isLeap =(year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(isLeap ? 1 : 0);
    }
}
