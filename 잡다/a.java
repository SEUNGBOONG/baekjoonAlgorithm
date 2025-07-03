package 잡다;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 개수

        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = getLastDigit(a, b);
            System.out.println(result);
        }
    }

    public static int getLastDigit(int a, int b) {
        a %= 10;

        if (a == 0) return 10;

        int[] pattern;

        switch (a) {
            case 1: pattern = new int[]{1}; break;
            case 2: pattern = new int[]{2, 4, 8, 6}; break;
            case 3: pattern = new int[]{3, 9, 7, 1}; break;
            case 4: pattern = new int[]{4, 6}; break;
            case 5: pattern = new int[]{5}; break;
            case 6: pattern = new int[]{6}; break;
            case 7: pattern = new int[]{7, 9, 3, 1}; break;
            case 8: pattern = new int[]{8, 4, 2, 6}; break;
            case 9: pattern = new int[]{9, 1}; break;
            default: pattern = new int[]{10}; break;
        }

        int idx = (b - 1) % pattern.length;
        return pattern[idx];
    }
}
