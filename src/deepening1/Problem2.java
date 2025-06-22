package deepening1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] standard = {1, 1, 2, 2, 2, 8};
        int[] given = new int[6];
        for (int i = 0; i < 6; i++) {
            given[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < 6; i++) {
            int need = standard[i] - given[i];
            System.out.print(need + " ");
        }
        System.out.println();
    }
}