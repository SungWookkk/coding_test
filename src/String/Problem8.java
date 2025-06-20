package String;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        sc.close();

        String[] words = s.split(" ");

        int count = words.length;

        System.out.println(count);
    }
}
