package math1;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        sc.close();

        if (a >= v) {
            System.out.println(1);
            return;
        }
        int daily = a- b;
        int day = (v - b + daily - 1) / daily;
        System.out.println(day);
    }
}
