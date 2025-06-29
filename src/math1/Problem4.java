package math1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        long side = 1L << N;
        long pointside = side + 1;

        long totalpoint = pointside * pointside;
        System.out.println(totalpoint);
    }
}
