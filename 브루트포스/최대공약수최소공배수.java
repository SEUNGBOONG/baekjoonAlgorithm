package 브루트포스;

import java.io.*;
import java.util.*;

public class 최대공약수최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxNumber = Integer.parseInt(st.nextToken()); //6
        int minNumber = Integer.parseInt(st.nextToken()); //180


        int firstResult = 0;
        int secondResult = 0;
        // 6 180
        for (int i = 1; i < minNumber; i++) {

            for (int j = 2; j < minNumber; j++) {
                int firstNumber = 0;
                int secondNumber = 0;

                firstNumber = maxNumber * i;  //6
                secondNumber = maxNumber * j; //12
                int result = 0;
                firstResult += firstNumber / maxNumber; //6/6
                secondResult += secondNumber / maxNumber; // 12/6
                result = firstResult * secondResult * maxNumber;
                if (result == minNumber) {
                    System.out.println(firstResult);
                    System.out.println(secondResult);
                }

            }
        }


    }
}
