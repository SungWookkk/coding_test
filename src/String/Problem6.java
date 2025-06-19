package String;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        sc.close();

        int[] pos = new int[26];
        for (int i = 0; i < 26; i++) {
            pos[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            if (pos[idx] == -1) {
                pos[idx] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < 26; k++) {
            sb.append(pos[k]).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
