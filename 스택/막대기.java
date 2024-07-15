package 스택;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 막대기 {

    public int solution(int[] number) {

        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int num = number[number.length];
        for (int i = 0; i < number.length - 1; i++) {
            list.add(i);
        }
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) > num) {
                stack.push(list.get(j));
            }
        }
        answer = stack.size();
        return answer;
    }


    public static void main(String[] args) {
        막대기 a = new 막대기();
        System.out.println(a.solution(new int[]{6, 6, 9, 7, 6, 4, 6}));

    }
}
