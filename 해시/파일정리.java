package 해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class 파일정리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String text = br.readLine();
            String extension = text.substring(text.lastIndexOf(".") + 1);
            map.put(extension, map.getOrDefault(extension, 0) + 1);
        }
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (String key : map.keySet()) {
            System.out.println(key+map.get(key));
        }
        System.out.println();

    }
}
