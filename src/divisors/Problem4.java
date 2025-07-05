package divisors;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for  (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            if (isPrime(num)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }

        int limit = (int)Math.sqrt(x);
        for (int i = 2; i <= limit; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
