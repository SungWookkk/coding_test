package math1;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
            return;
        }
        int count = 1;
        int end = 1;
        int step = 6;

        while (end < n) {
            end += step;
            count++;
            step += 6;
        }
        System.out.println(count);
    }
}
