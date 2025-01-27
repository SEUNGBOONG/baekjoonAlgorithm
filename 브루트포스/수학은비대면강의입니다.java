package 브루트포스;

import java.io.*;
import java.util.*;

public class 수학은비대면강의입니다 {
    public static void main(String[] args) throws IOException {
        수학은비대면강의입니다 a = new 수학은비대면강의입니다();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄 입력 (1 3 -1)
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] num1 = new int[3];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = Integer.parseInt(st1.nextToken());
        }

        // 두 번째 줄 입력 (4 1 7)
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] num2 = new int[3];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = Integer.parseInt(st2.nextToken());
        }

        // 출력 결과
        System.out.println(Arrays.toString(a.y(num1, num2)));
    }

    public int[] y(int[] num1, int[] num2) {
        int[] list = new int[2];  // 배열 크기를 2로 설정해서 x, y 값을 담을 수 있도록 수정

        // num1 = [1, 3, -1] / num2 = [4, 1, 7]
        // 첫 번째 식: num1[0] * x + num1[1] * y = num1[2]
        // 두 번째 식: num2[0] * x + num2[1] * y = num2[2]

        int a1 = num1[0], b1 = num1[1], c1 = num1[2];
        int a2 = num2[0], b2 = num2[1], c2 = num2[2];

        // 행렬식 D 계산
        int D = a1 * b2 - a2 * b1;

        // x와 y를 구하기 위한 행렬식 D_x, D_y 계산
        int D_x = c1 * b2 - c2 * b1;
        int D_y = a1 * c2 - a2 * c1;

        // 크래머의 법칙을 사용하여 x, y 계산
        list[0] = D_x / D;  // x값
        list[1] = D_y / D;  // y값

        return list;  // x, y 값을 반환
    }
}
