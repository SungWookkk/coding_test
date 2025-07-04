package divisors;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        sc.close();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if(count == s) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
