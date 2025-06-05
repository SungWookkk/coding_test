package step3;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 1; i <= 9; i++) {
            int result = a * i;
            System.out.println(a + " * " + i + " = " + result);
        }
    }
}
