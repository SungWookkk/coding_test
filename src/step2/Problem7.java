package step2;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result;

        if (a == b && b == c) {
            result = 10000 + a * 1000;
        } else if (a == b) {
            result = 1000 + a * 100;
        } else if (a == c) {
            result = 1000 + a * 100;
        } else if (b == c) {
            result = 1000 + b * 100;
        } else {
            int max_ab = Math.max(a, b);
            int max_abc = Math.max(max_ab, c);

            result = max_abc * 100;
        }
        System.out.println(result);
    }
}
