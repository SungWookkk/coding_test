package step1;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ones = b % 10;
        int tens = (b / 10) % 10;
        int hundred = b / 100;

        int part1 = a * ones;
        int part2 = a * tens;
        int part3 = a * hundred;

        int total = a * b;

        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);

        System.out.println(total);
    }
}
