package stackqueuedeck;

import java.util.Scanner;
import java.util.Stack;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            int x= sc.nextInt();
            if (x == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(x);
            }
        }
        long sum = 0;
        while
            (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
        sc.close();
    }
}
