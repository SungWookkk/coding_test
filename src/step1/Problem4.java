package step1;

import java.util.Scanner;

public class Problem4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        double Div = (double) A / B;

        System.out.printf("%.10f\n", Div);
    }
}