package 해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new LinkedList<>();  // 일반 큐 사용
        List<Integer> checkList = new ArrayList<>();

        int count = 0;
        int number = st.countTokens();

        // 큐에 숫자 추가
        for (int i = 0; i < number; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        // 숫자 개수 세기
        while (!queue.isEmpty()) {
            int num = queue.poll();  // 큐에서 꺼내기
            if (queue.contains(num)) {
                count++;
            } else {
                checkList.add(count + 1);
                count = 0;
            }
        }

        // 결과 출력
        for (int result : checkList) {
            System.out.print(result + " ");
        }
    }
}
