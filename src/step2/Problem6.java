package step2;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        int totalMin = h * 60 + m;
        int finishMin = totalMin + t;

        int newH =(finishMin / 60) % 24;
        int newM = finishMin % 60;

        System.out.println(newH + " " + newM);
    }
}
