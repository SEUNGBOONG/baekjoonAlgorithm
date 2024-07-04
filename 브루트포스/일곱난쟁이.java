package 브루트포스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 일곱난쟁이 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] a = new int[6];
        for (int i = 0; i < 9; i++) {
            int b = scanner.nextInt();
            for (int j = 0; j < a.length; j++) {
                if (sum <= 100) {
                    sum += b;
                    a[j] = b;
                }
            }
        }
        System.out.println(a.toString());
    }
}
//20
//7
//23
//19
//10
//15
//25
//8
//13