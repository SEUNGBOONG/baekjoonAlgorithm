package 이진탐색;

import java.util.*;

public class 회의실배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int count = sc.nextInt(); sc.nextLine();
        int meeting[][] = new int[count][2];
        for(int i = 0; i<count; i++) {
            meeting[i][0] = sc.nextInt();
            meeting[i][1] = sc.nextInt();
        }
        Arrays.sort(meeting, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
            } else {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int endTime = meeting[0][1];
        result++;
        for (int i =1; i<count;i++){
            if(meeting[i][0]>=endTime){
                endTime=meeting[i][1];
                result++;

            }else {
                continue;
            }
        }
        System.out.println(result);

    }

}
