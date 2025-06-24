package deepening1;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine()
                .toUpperCase();
        sc.close();

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'A']++;
        }

        int max = -1;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }

        int count = 0;
        int idxOfMax = -1;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == max) {
                count++;
                idxOfMax = i;
            }
        }

        if (count > 1) {
            System.out.println('?');
        } else {
            System.out.println((char)('A' + idxOfMax));
        }
    }
}
