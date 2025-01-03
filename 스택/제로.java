//package 스택;
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class 제로 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < N; i++) {
//            int number = sc.nextInt();
//            if (number == 0) {
//                stack.pop();
//            } else {
//                stack.add(number);
//            }
//        }
//
//        if (stack.isEmpty()) {
//            System.out.println(0);
//            return;
//        }
//        int sum = 0;
//        while (!stack.isEmpty()) {
//            int num = stack.pop();
//            sum += num;
//        }
//        System.out.println(sum);
//    }
//}
