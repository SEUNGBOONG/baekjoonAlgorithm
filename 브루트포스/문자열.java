package 브루트포스;

import java.util.*;

public class 문자열 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x= scanner.nextLine();
        String y = scanner.nextLine();
        int result = Integer.MAX_VALUE;

        for (int i = 0; i<y.length();i++){
            int count = 0 ;
            for (int j =0; j<x.length();j++){
                if(x.charAt(j)!=y.charAt(j+i)){
                    count ++;
                }
            }
            result = Math.min(count,result);
        }
        System.out.println(result);
    }
}
