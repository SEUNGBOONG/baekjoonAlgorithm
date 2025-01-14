package 브루트포스;

import java.util.Scanner;

public class 방정식 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] values = input.split(" ");

        int x1 = Integer.parseInt(values[0]);
        int y1 = Integer.parseInt(values[1]);
        int result1 = Integer.parseInt(values[2]);

        int x2 = Integer.parseInt(values[3]);
        int y2 = Integer.parseInt(values[4]);
        int result2 = Integer.parseInt(values[5]);

        if (x1 == 0 || x2 == 0 || (y1 - y2) == 0) {
            return;
        }

        int num;
        if (x1 != x2) {
            if (x1 > x2) {
                num = x1 / x2;
                x2 = x2 * num;
                y2 = y2 * num;
                result2 = result2 * num;
            } else {
                num = x2 / x1;
                x1 = x1 * num;
                y1 = y1 * num;
                result1 = result1 * num;
            }
        }

        int y = (result2 - result1) / (y1 - y2);
        int x = (result1 - y1 * y) / x1;

        System.out.println(x + " " + y);
    }
}
