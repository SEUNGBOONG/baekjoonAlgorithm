package b;

import java.util.Scanner;

public class prompt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] files = new String[n];

        for (int i = 0; i < n; i++) {
            files[i] = sc.next();
        }

        StringBuilder result = new StringBuilder();

        int length = files[0].length();

        for (int i = 0; i < length; i++) {
            char ch = files[0].charAt(i);
            boolean same = true;

            for (int j = 1; j < n; j++) {
                if (files[j].charAt(i) != ch) {
                    same = false;
                    break;
                }
            }

            if (same) {
                result.append(ch);
            } else {
                result.append('?');
            }
        }

        System.out.println(result);
    }
}
