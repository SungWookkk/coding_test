package feel;

import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        sc.close();
        for (int k = L; k <= 100; k++) {
            int num = N - k * (k - 1) / 2;
            if (num < 0) break;
            if (num % k == 0) {
                int a = num / k;
                if (a < 0) break;
                for (int i = 0; i < k; i++) {
                    System.out.print(a + i);
                    if (i < k - 1) System.out.print(" ");
                }
                return;
            }
        }
        System.out.println(-1);
    }
}