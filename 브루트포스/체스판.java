package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 체스판 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        Queue<String> q = new LinkedList<>();
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                q.add(st.nextToken());
            }
        }
        int count = 0;
        while (!q.isEmpty()) {
            for (int i = 0; i < num2; i++) {
                String a = q.poll();
                if (a == "W") {
                    if (q.peek() == "W") {
                        count++;
                        q.poll();
                        i++;
                    } else {
                        q.poll();
                        i++;
                    }
                } else if (a == "B") {
                    if (q.peek() == "B") {
                        q.poll();
                        i++;

                    } else if (q.peek() == "W") {
                        count++;
                        q.poll();
                        i++;

                    }
                }
            }
        }
    }
}
