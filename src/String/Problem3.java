package String;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int tc= 0; tc<t; tc++){
            String s = sc.nextLine();

            char first = s.charAt(0);
            char second = s.charAt(s.length()-1);
            System.out.println("" + first + second);
        }

    }
}
