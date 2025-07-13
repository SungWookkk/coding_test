package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int q = sc.nextInt();
            sb.append(set.contains(q) ? 1 : 0).append(" ");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
}
