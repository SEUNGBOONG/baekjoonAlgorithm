package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class 약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                queue.add(i);
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            if (queue.peek() != num2) {
                queue.poll();
                count++;
            }
            if (!queue.contains(num2)){
                count =0;
            }
            queue.poll();
        }
        System.out.println(count);
    }
}
