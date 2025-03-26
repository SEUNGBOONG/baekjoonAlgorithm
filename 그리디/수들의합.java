package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class 수들의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
//2 162
        int sum = 0;
        int count = 1;
        while (m != n) {
            if (m < n) {
                System.out.println(-1);
                return;
            }
            String str = String.valueOf(m);
            if (m % 2 == 0) {
                m /= 2;
            } else if (str.charAt(str.length() - 1) == '1') {
                str = str.substring(0, str.length() - 1);
                m=Integer.parseInt(str);
            }
            else {
                System.out.println(-1);
                return;
            }
        }


    }
}
