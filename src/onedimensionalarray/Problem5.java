package onedimensionalarray;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N];

        for (int op = 0; op < M; op++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int idx = i - 1; idx < j; idx++) {
                baskets[idx] = k;
            }
        }

        sc.close();

        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
        System.out.println();
    }
}