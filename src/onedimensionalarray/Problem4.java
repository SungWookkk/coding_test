package onedimensionalarray;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int idx = 0;

        for (int i = 1; i <= 9; i++) {
            int x = sc.nextInt();

            if (x > max) {
                max = x;
                idx = i;
            }
        }

        sc.close();

        System.out.println(max);
        System.out.println(idx);
    }
}