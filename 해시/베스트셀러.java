package 해시;

import java.io.*;
import java.util.*;

public class 베스트셀러 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        int max=0;
        for (int i = 0; i < n; i++) {
            String book = br.readLine();
            map.put(book, map.getOrDefault(book,0)+1);
            max = Math.max(max, map.get(book));
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) list.add(entry.getKey());
        }
        Collections.sort(list);
        System.out.print(list.get(0));
    }
}
