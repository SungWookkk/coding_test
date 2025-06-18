package array;

import java.util.HashSet;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            int r = n % 42;
            remainders.add(r);
        }
        sc.close();
        System.out.println(remainders.size());
    }
}