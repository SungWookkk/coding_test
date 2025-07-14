package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.next());
        }
        int count = 0;
        for(int i = 0; i < m; i++){
            if(set.contains(sc.next())){
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
