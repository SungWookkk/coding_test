package deepening1;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        s = s.replaceAll("dz=", "#");

        s = s.replaceAll("c=", "#");
        s = s.replaceAll("c-", "#");
        s = s.replaceAll("dz=", "#");
        s = s.replaceAll("d-", "#");
        s = s.replaceAll("lj", "#");
        s = s.replaceAll("nj", "#");
        s = s.replaceAll("s=", "#");
        s = s.replaceAll("z=", "#");

        int count = s.length();

        System.out.println(count);

    }
}
