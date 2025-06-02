package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 고층건물 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine());
        int[] height = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int maxVisible = 0;

        for (int i = 0; i < N; i++) {
            int visible = 0;

            // 왼쪽 보기
            double maxSlopeLeft = Double.NEGATIVE_INFINITY;
            for (int j = i - 1; j >= 0; j--) {
                double slope = (double)(height[i] - height[j]) / (i - j);
                if (slope > maxSlopeLeft) {
                    maxSlopeLeft = slope;
                    visible++;
                }
            }

            // 오른쪽 보기
            double maxSlopeRight = Double.NEGATIVE_INFINITY;
            for (int j = i + 1; j < N; j++) {
                double slope = (double)(height[j] - height[i]) / (j - i);
                if (slope > maxSlopeRight) {
                    maxSlopeRight = slope;
                    visible++;
                }
            }

            maxVisible = Math.max(maxVisible, visible);
        }

        System.out.println(maxVisible);
    }
}
