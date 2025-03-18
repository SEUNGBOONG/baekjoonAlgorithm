package 해시;

import java.io.*;
import java.util.*;

public class 숫자카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            map.put(Integer.valueOf(br.readLine()), 0);
        }
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            map.put(number, map.getOrDefault(number,0) +  1);
            list.add(map.get(number));
        }



        StringBuilder sb = new StringBuilder();
        sb.append(list.size() + "\n");
        for (int s : list) {
            sb.append(s + "\n");
        }
        System.out.print(sb);
    }
}
