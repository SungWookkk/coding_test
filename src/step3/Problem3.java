package step3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();

        int a = sc.nextInt();

        int total= 0;

        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            total += x * y;
        }
        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
