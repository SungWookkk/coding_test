package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] names = new String[N + 1];
        Map<String, Integer> mapNameToNo = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            names[i] = name;
            mapNameToNo.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            char c = query.charAt(0);
            if (c >= '0' && c <= '9') {
                int num = Integer.parseInt(query);
                sb.append(names[num]);
            } else {
                sb.append(mapNameToNo.get(query));
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
        br.close();
    }
}

