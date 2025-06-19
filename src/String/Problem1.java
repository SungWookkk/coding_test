package String;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int i = sc.nextInt();
        sc.close();

        char result = S.charAt(i-1);
        System.out.println(result);
    }
}
