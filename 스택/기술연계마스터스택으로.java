//package 스택;
//
//import java.util.*;
//
//public class 기술연계마스터스택으로 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        String skills = scanner.next();
//
//        int validCount = countValidSkills(N, skills);
//        System.out.println(validCount);
//
//        scanner.close();
//    }
//
//    public static int countValidSkills(int N, String skills) {
//        Stack<Character> stack = new Stack<>();
//        int validCount = 0;
//
//        for (int i = 0; i < N; i++) {
//            char skill = skills.charAt(i);
//
//            if (skill >= '1' && skill <= '9') {
//                validCount++;
//            } else if (skill == 'L') {
//                if (!stack.isEmpty() && stack.peek() == 'R') {
//                    stack.pop();
//                    validCount++;
//                }
//            } else if (skill == 'S') {
//                stack.push('K');
//            } else if (skill == 'K') {
//                if (!stack.isEmpty() && stack.peek() == 'S') {
//                    stack.pop();
//                    validCount++;
//                }
//            }
//        }
//
//        return validCount;
//    }
//}
