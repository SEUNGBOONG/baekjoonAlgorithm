package 해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class 회사에있는사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();

        // n번만큼 이름과 상태를 입력받아서 처리
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            String state = br.readLine();

            // 상태가 "enter"면 map에 이름 추가, "leave"면 map에서 이름 제거
            if (state.equals("enter")) {
                map.put(name, state);
            } else {
                map.remove(name);
            }
        }

        // map의 key를 리스트에 추가
        ArrayList<String> list = new ArrayList<>(map.keySet());

        // 리스트를 알파벳 순으로 정렬
        Collections.sort(list);

        // 정렬된 이름을 출력
        for (String name : list) {
            System.out.println(name);
        }
    }
}
