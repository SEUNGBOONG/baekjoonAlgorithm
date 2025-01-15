package 브루트포스;

import java.io.*;
import java.util.*;

public class 공약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        int z = 0;

        if (n == 2) {
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            int value = Math.min(x, y);
            for (int i = 1; i < value + 1; i++) {
                if (x % i == 0 && y % i == 0) {
                    System.out.println(i);
                }
            }

        } else {
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = Integer.parseInt(st.nextToken());
            int value = Math.min(x, Math.min(y, z));
            for (int i = 1; i < value + 1; i++) {
                if (x % i == 0 && y % i == 0 && z % i == 0) {
                    System.out.println(i);
                }
            }
        }

    }
}
