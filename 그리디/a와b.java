package 그리디;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class a와b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();  // 목표 문자열
        String T = scanner.nextLine();  // 변환할 문자열

        while (T.length() > S.length()) {
            if (T.charAt(T.length() - 1) == 'A') {
                T = T.substring(0, T.length() - 1); // 마지막 'A' 제거
            } else {
                T = new StringBuilder(T.substring(0, T.length() - 1)).reverse().toString(); // 'B' 제거 후 뒤집기
            }
        }

        // 변환 결과 확인
        System.out.println(S.equals(T) ? 1 : 0);
    }
}
