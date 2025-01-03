//package 스택;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class reverseStack {
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        for (int i = 0; i < number; i++) {
//            String value = scanner.next();
//            List<String> a = new ArrayList<>();
//            Stack<String> stack = new Stack<>();
//            for (String list : value.split(" ")) {
//                stack.push(list);
//            }
//            while (!stack.isEmpty()) {
//                a.add(stack.pop());
//            }
//            String text = String.join(" ", a);
//            System.out.printf("Case %num:"+i+text);
//        }
//    }
//}
