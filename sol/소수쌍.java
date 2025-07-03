package sol;

import java.io.*;
import java.util.*;

public class 소수쌍 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = st.countTokens();
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i< a;i++){
            list.add(st.countTokens());
        }

        for(int i = 1; i<list.size();i++){
            int sum =0;
            sum += list.get(0)+list.get(i);

            if(!prime(sum)){

            }
        }
        // 1 4 7 10 11 12

        System.out.println();

    }

    public static boolean prime(int num){
        for(int i = 2; i<num-1;i++){
            if(num%i == 0){
                return true;
            }
        }
        return false;
    }

}
