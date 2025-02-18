package dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 알파벳 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < b; i++) {
            list.add(sc.nextLine().substring(i));
        }

    }

    public void dfs(String sc) {
    }
}
