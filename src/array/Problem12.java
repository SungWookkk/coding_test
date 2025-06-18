package array;

import java.util.Scanner;

public class Problem12 {
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
            int left = i - 1;
            int right = j - 1;

            while (left < right) {
                int tmp = baskets[left];
                baskets[left] = baskets[right];
                baskets[right] = tmp;
                left++;
                right--;
            }
        }
        sc.close();

        for (int k = 0; k < N; k++) {
            System.out.print(baskets[k] + " ");
        }
        System.out.println();
    }
}