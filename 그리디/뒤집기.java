package 그리디;

import java.util.*;

public class 뒤집기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        int firstCount = 0;
        int secondCount = 0;
        char initialChar = message.charAt(0);
        boolean firstPhase = true;

        for (int i = 1; i <message.length(); i++) {
            if (message.charAt(i) != message.charAt(i - 1)) {
                if (firstPhase) {
                    firstCount++;
                    firstPhase = false;  // 첫 번째 변화 후, secondCount로 전환
                } else {
                    secondCount++;
                }
            }
        }
        System.out.println(Math.min(firstCount, secondCount));


    }
}
