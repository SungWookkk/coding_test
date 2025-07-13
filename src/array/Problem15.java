package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] sort = arr.clone();
        Arrays.sort(sort);
        List<Integer> list = new ArrayList<>();
        list.add(sort[0]);
        for (int i = 1; i < N; i++) {
            if (sort[i] > sort[i - 1]) {
                list.add(sort[i]);
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map.get(arr[i])).append(' ');
        }
        System.out.println(sb.toString());
        br.close();
    }
}
