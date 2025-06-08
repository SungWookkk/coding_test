package time_complexity.problem;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        long count = n * (n - 1) / 2;

        System.out.println(count);
        System.out.println(2);
    }
}
