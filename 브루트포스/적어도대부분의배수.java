package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 적어도대부분의배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = 0;
        int count = 0;
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (true){
            for(int i = 0; i < 5; i++) {
                if(N >= arr[i] && N % arr[i] == 0) count++;
            }
            if(count > 2) break;
            //3개이상 나눠지지 않았으면 count 초기화
            count = 0;
        }
    }

}
