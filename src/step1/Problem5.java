package step1;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = A + B;
        int minus = A - B;
        int multi = A * B;
        double div = (double) A / B;
        int remain = A % B;

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(remain);
    }
}
