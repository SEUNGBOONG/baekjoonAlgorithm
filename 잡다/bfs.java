package 잡다;

import java.util.*;

public class bfs {
    public String solution(int N, String[] W) {
        // 그래프 생성
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < N; i++) {
            graph.put(i, new ArrayList<>());
            for (int j = 0; j < N; j++) {
                if (i != j && W[i].charAt(W[i].length() - 1) == W[j].charAt(0)) {
                    graph.get(i).add(j);
                }
            }
        }

        // BFS 탐색
        for (int i = 0; i < N; i++) {
            if (bfs(W, graph, i, N)) {
                return "Yes";
            }
        }
        return "No";
    }

    private boolean bfs(String[] words, Map<Integer, List<Integer>> graph, int start, int N) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[N];
        queue.offer(new int[]{start, 1});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int index = current[0], count = current[1];

            if (count == N) {
                return true;
            }

            for (int next : graph.get(index)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[]{next, count + 1});
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        끝말잇기 wc = new 끝말잇기();
        String[] words = {"apple", "everyone", "element", "truck", "kite"};

        long startTime = System.nanoTime(); // 시작 시간
        String result = wc.solution(5, words);
        long endTime = System.nanoTime(); // 종료 시간

        System.out.println("Result: " + result);
        System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms"); // 실행 시간(ms)
    }
}
