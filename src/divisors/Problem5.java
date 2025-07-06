package divisors;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int minPrime = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                if (i < minPrime) {
                    minPrime = i;
                }
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }
        sc.close();
    }
    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        int limit = (int) Math.sqrt(x);
        for (int i = 2; i <= limit; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
