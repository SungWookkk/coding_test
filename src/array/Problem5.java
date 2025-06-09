package array;


import java.io.*;

public class Problem5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            count[x]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int v = 0; v <= 10000; v++) {
            for (int k = 0; k < count[v]; k++) {
                sb.append(v).append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
