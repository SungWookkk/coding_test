package String;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().trim();
        sc.close();

        String[] words = line.isEmpty()
                ? new String[0]
                : line.split(" ");

        System.out.println(words.length);
    }
}
