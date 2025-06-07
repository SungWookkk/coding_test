package time_complexity;

public class QuadraticTime {
    public static void main(String[] args) {
        int n = 50;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
