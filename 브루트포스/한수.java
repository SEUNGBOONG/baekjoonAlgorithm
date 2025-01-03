package 브루트포스;
import java.util.*;


public class 한수 {

    public static void main(String[] args) {
        한수 a = new 한수();
        System.out.println(a.solution(210));
    }

    public int solution(int N) {
        int count = 0;
        if (N < 100) {
            return N;
        } else {
            count = 99;

            for (int i = 100; i <= N; i++) {
                int hun = i/100;
                int tens = (i/10)%10;
                int one = (i%10);

                if((hun-tens)==(tens-one)){
                    count++;
                }
            }
        }

        return count;
    }
}
