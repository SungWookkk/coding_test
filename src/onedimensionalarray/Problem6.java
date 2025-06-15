package onedimensionalarray;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int op = 0; op < M; op++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int tmp = baskets[i - 1];
            baskets[i - 1] = baskets[j - 1];
            baskets[j - 1] = tmp;
        }

        sc.close();

        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
        System.out.println();
    }
}