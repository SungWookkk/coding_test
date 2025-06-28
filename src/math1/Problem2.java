package math1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();

        if (N == 0) {
            System.out.println("0");
            return;
        }

        while (N > 0) {
            int rem = N % B;
            N = N / B;

            if (rem < 10) {
                sb.append((char)('0' + rem));
            } else {
                sb.append((char)('A' + (rem - 10)));
            }
        }

        sb.reverse();
        System.out.println(sb);
    }
}
