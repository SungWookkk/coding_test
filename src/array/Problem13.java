package array;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] scores = new int[N];

        int M = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] > M) {
                M = scores[i];
            }
        }
        sc.close();

        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += scores[i] / (double) M * 100;
        }

        double average = sum / N;

        System.out.printf("%.6f\n", average);
    }
}