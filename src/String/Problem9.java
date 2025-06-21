package String;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        sc.close();

        StringBuilder sbA = new StringBuilder(A);
        StringBuilder sbB = new StringBuilder(B);

        String ra = sbA.reverse().toString();
        String rb = sbB.reverse().toString();

        int ai = Integer.parseInt(ra);
        int bi = Integer.parseInt(rb);

        int answer = Math.max(ai, bi);

        System.out.println(answer);
    }
}