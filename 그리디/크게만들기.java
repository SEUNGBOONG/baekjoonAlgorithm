package 그리디;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class 크게만들기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String input = br.readLine();
        char[] arr = input.toCharArray();
        Deque<Character> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            while (m > 0 && dq.getLast() < arr[i]) {
                dq.removeLast();
                m--;
            }
            dq.addLast(arr[i]);
        }

        StringBuilder ans = new StringBuilder();
        // 위 for문에서 K가 0이 되기 전에 끝난 경우를 대비하여
        // dq.size() - K만큼만 출력한다.
        while (dq.size() > m) {
            ans.append(dq.removeFirst());
        }

        // 위 for문에서 K가 0이 되기 전에 끝난 경우를 대비하여
        // dq.size() - K만큼만 출력한다.
        while (dq.size() > m) {
            ans.append(dq.removeFirst());
        }

        bw.write(ans.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}

// 1924 줬어
