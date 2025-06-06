package step3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int a = Integer.parseInt(line);

        StringBuilder sb =  new StringBuilder();
        for (int i = 0; i < a; i++) {

            String line1 = br.readLine();

            StringTokenizer st = new StringTokenizer(line1);

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int sum = A + B;

            sb.append(sum).append("\n");

        }
        System.out.println(sb.toString());

    }

}
