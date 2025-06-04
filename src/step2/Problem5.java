package step2;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        int newM = m - 45;

        int newH;
        if (newM < 0) {
            newM += 60;
            if (h == 0) {
                newH = 23;
            } else {
                newH = h - 1;
            }
        } else {
            newH = h;
        }
        System.out.println(newH + " " + newM);
    }
}
