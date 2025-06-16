package feel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class GomGom2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.equals("ENTER")) {
                count += set.size();
                set.clear();
            } else {
                set.add(s);
            }
        }
        count += set.size();
        System.out.print(count);
    }
}