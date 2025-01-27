package 브루트포스;

import java.util.Scanner;

public class 분해합 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        분해합 a = new 분해합();
        int result = a.result(number);
        System.out.println(result);
    }

    public int result(int number) {
        for (int i = 1; i < number; i++) { // 1부터 number-1까지 검사
            int sum = i;
            int temp = i;

            // 각 자릿수 합을 계산
            while (temp > 0) {
                sum += temp % 10; // 마지막 자리 더하기
                temp /= 10; // 한 자리 줄이기
            }

            // 자릿수 합과 원래 숫자가 같은 경우
            if (sum == number) {
                return i; // 생성자 반환
            }
        }

        return 0; // 생성자가 없는 경우 0 반환
    }
}
