package math1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T =  sc.nextInt();
        int[] coin  = {25, 10, 5, 1};

        for (int t = 0; t < T; t++) {
            int C =  sc.nextInt();
            for (int i = 0; i < coin.length; i++) {
                int count = C /  coin[i];
                C = C % coin[i];
                System.out.print(count + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
