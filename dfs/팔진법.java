package dfs;

import java.util.Scanner;

public class 팔진법 {
    public static void main(String[] args) {
        String binary = "110011111"; // 예시 2진수
        int decimal = Integer.parseInt(binary, 2);
        int octal = Integer.parseInt(Integer.toOctalString(decimal));
        System.out.println("2진수: " + binary);
        System.out.println("8진수: " + octal);
    }
}
