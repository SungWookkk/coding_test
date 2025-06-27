package math1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        sc.close();

        long res = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int digit = Character.digit(c, n);
            res = res * n + digit;

        }
        System.out.println(res);
    }
}
