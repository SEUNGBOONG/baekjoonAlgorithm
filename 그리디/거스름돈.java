package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        while(true){
            if(N%5 == 0){
                count += N/5;
                System.out.println(count);
                break;
            }else{
                N -= 2;
                count++;
            }
            if(N < 0){
                System.out.println(-1);
                break;
            }
        }
    }
}
