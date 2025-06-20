package String;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int tc = 0; tc < T; tc++) {
            int R = sc.nextInt();
            String S =  sc.next();

            for (char c : S.toCharArray()) {
                for (int i = 0; i < R; i++) {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }
        sc.close();
    }
}
