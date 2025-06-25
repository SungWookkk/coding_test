package deepening1;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int a = 0; a < N; a++) {
            String s = sc.next();
            boolean[] check = new boolean[26];
            char prob = '\0';
            boolean found = true;

            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if( c!= prob){
                    if(check[c-'a']){
                        found = false;
                        break;
                    }
                    check[c-'a'] = true;
                }
                prob = c;
            }
            if(found){
                count++;
            }
        }
        sc.close();
        System.out.println(count);

    }
}
