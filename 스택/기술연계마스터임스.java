//package 스택;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class 기술연계마스터임스 {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int s= scanner.nextInt();
//        String a = scanner.next();
//        if(a.length()==s){
//            List<String> b = List.of(a.split(""));
//            List<String> number = List.of(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"});
//            int count = 0;
//            for (int i = 0; i < b.size(); i++) {
//                if (b.get(i) == "L") {
//                    for (int j = i+1; j < b.size(); j++) {
//                        if (b.get(j) == "R") {
//                            count++;
//                        }
//                    }
//                }
//                if (b.get(i) == "S") {
//                    for (int j = i+1; j < b.size(); j++) {
//                        if (b.get(j) == "K") {
//                            count++;
//                        }
//                    }
//                }
//                if (number.contains(b.get(i))) {
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//    }
//
//
//
//}
