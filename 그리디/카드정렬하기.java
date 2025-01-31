package 그리디;

import java.util.*;

public class 카드정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            pq.add(sc.nextInt());
        }

        int result = 0;

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            int sum = a + b;
            result += sum;
            pq.add(sum);
        }

        System.out.println(result);
    }
}
