package time_complexity.problem;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();
        boolean ok = (a1 <= c) && (a1 * n0 + a0 <= c * n0);

        System.out.println(ok ? 1 : 0);



    }
}
