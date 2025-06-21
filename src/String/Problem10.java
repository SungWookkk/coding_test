package String;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int dial;
            switch (c) {
                case 'A': case 'B': case 'C': dial = 2; break;
                case 'D': case 'E': case 'F': dial = 3; break;
                case 'G': case 'H': case 'I': dial = 4; break;
                case 'J': case 'K': case 'L': dial = 5; break;
                case 'M': case 'N': case 'O': dial = 6; break;
                case 'P': case 'Q': case 'R': case 'S': dial = 7; break;
                case 'T': case 'U': case 'V': dial = 8; break;
                case 'W': case 'X': case 'Y': case 'Z': dial = 9; break;
                default: dial = 0;
            }
            total += dial + 1;
        }

        System.out.println(total);
    }
}