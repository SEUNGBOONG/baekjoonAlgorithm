package 해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 대칭차집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map1.put(Integer.valueOf(br.readLine()), 0);
        }
        int count = 0;

        for (int i = 0; i < m; i++) {
            map2.put(Integer.valueOf(br.readLine()), 0);
            if (!map1.containsKey(br.readLine())) count++;
        }

        for (int i = 0; i < n; i++) {
            if (!map2.containsKey(br.readLine())) count++;
        }
        System.out.println(count);
    }
}
