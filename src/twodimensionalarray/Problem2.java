package twodimensionalarray;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int maxRow = 0, maxCol = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int value = sc.nextInt();
                if (value > max) {
                    max = value;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        sc.close();

        System.out.println(max);
        System.out.println((maxRow + 1) + " " + (maxCol + 1));
    }
}
