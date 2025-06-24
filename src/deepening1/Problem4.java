package deepening1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int n = s.length();
        boolean isPalindrom = true;

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                isPalindrom = false;
                break;
            }
        }
        System.out.println(isPalindrom ? 1 : 0);
    }
}
