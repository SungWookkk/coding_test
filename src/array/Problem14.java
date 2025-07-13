package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Problem14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Member> list  = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age =  Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Member(age, name));
        }
        Collections.sort(list,
                (a,b) -> a.age - b.age);
        StringBuilder sb = new StringBuilder();
        for (Member m : list) {
            sb.append(m.age).append(" ").append(m.name).append("\n");
        }
        System.out.println(sb.toString());
    }
}
class Member {
    int age;
    String name;
    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
