package twodimensionalarray;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = a[i][j] + b[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
