package 맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class 듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count =0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> data = new HashMap<>();
        List<String> names = List.of(new String[]{sb.toString()});

        List<String> twoNames = List.of(new String[]{sb.toString()});

        for (int i = 0; i <= names.size(); i++) {
            if (twoNames.contains(names.get(i))) {
                data.put(names.get(i), 1);
                count+= data.get(i);
            }
        }

        System.out.println(count);
        System.out.println(data);

    }
}
