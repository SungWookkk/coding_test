package step3;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int repeatCount = n /4;

        for (int i = 0; i < repeatCount; i++) {
            System.out.print("long ");
        }
        System.out.println("int");

    }
}
