package math1;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        int k = 0;

        while (sum < n) {
            k++;
            sum += k;
        }
        int preSum = sum - k;
        int idx= n- preSum;
        int numerator, denominator;

        if (k % 2 == 0) {
            numerator = idx;
            denominator = k + 1 - idx;
        } else {
            numerator = k+1-idx;
            denominator = idx;
        }
        System.out.println(numerator + "/" + denominator);
    }
}
