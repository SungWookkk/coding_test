package feel;

import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        sc.close();

        boolean found = false;

        for (int k = L; k <= 10000; k++) {
            int numerator = N - k * (k-1) / 2;
            if (numerator < 0)break;

            if(numerator % k == 0){
                int x = numerator / k;
                if(x >= 1){
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < k; i++) {
                        sb.append(x+i).append(' ');
                    }
                    System.out.println(sb.toString().trim());
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println(-1);
        }
    }
}
