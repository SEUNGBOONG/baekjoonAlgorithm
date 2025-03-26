package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 수들의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int count = 0;
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        while (true){
//            queue.add(count);
//        }

        sum=n/2;
        System.out.println(sum);

    }
}
