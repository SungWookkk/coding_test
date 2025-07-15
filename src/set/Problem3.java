package set;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String > set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            if (status.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
}
