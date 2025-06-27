package twodimensionalarray;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String[] lines = new String[5];
        int maxLen = 0;

        for (int i = 0; i < 5; i++) {
            lines[i] = sc.nextLine();
            if (lines[i].length() > maxLen) {
                maxLen = lines[i].length();
            }
        }
        sc.close();

        for(int col = 0; col < maxLen; col++) {
            for(int row = 0; row < 5; row++) {
                if(col < lines[row].length()) {
                    System.out.print(lines[row].charAt(col));
                }
            }

        }
    }
}
