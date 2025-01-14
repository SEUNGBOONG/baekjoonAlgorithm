package 브루트포스;

import java.util.*;

public class 백설공주 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ary = new int[9];
        int[] str = new int[7];
        for(int i = 0; i<9;i++){
            ary[i]=scanner.nextInt();
        }
        int sum = Arrays.stream(ary).sum();
        while(sum ==100){
            for(int j=0; j<8; j++){
                for(int k=j+1; k<9; k++){
                    int current = ary[j]+ ary[k];
                    if(sum -current==100){
                        ary[j]=0;
                        ary[k]=0;
                        
                    }

                }
            }
        }

    }
}
