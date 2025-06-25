package deepening1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumCredit = 0.0;
        double sumWeigthed = 0.0;

        for (int i = 0; i < 20; i++) {
            String line = sc.nextLine();
            StringTokenizer st = new StringTokenizer(line);
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) {
                continue;
            }
            double score = toScore(grade);
            sumCredit += credit;
            sumWeigthed += credit * score;
        }
        sc.close();

        double gpa = sumWeigthed / sumCredit;
        System.out.printf("%.6f\n", gpa);
    }
    static double toScore(String grade) {
        switch(grade){
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F" : return 0.0;
            default  : return 0.0;
        }
    }
}
