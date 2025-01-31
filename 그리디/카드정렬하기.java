package 그리디;

import java.util.*;
import java.util.Scanner;

public class 카드정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int temp = 0;
        int result = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        //10 30 40
        while (true) {
            Collections.sort(list);
            int i = 0;
            int tmp = 0;
            if (list.size()>1){
                if (list.get(i) + list.get(i + 1) < list.get(i + 2) &&
                        list.get(i) + list.get(i + 1) == list.get(i + 2) ) {
                    tmp = list.get(i) + list.get(i + 1);
                    list.remove(i);
                    list.remove(i+1);
                    list.add(tmp);
                    result += tmp;
                }
            }

            else{
                tmp+=list.get(i)+list.get(i+1);
                result += tmp;
                System.out.println(result);
                break;

            }
        }
        System.out.println(result);

    }

}
