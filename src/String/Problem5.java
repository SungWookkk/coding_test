package String;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();
        sc.close();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            int d = c - '0';
            sum += d;
        }
        System.out.println(sum);

    }
}
