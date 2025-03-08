package 잡다;

public class 끝말잇기 {
    public String solution(int N, String[] W) {
        boolean[] visited = new boolean[N]; // 단어 사용 여부 체크
        for (int i = 0; i < N; i++) {
            if (canFormWordChain(W, visited, i, 1)) {
                return "Yes";
            }
        }
        return "No";
    }

    private boolean canFormWordChain(String[] words, boolean[] visited, int index, int count) {
        if (count == words.length) {
            return true; // 모든 단어를 사용했을 때 성공
        }

        visited[index] = true;
        char lastChar = words[index].charAt(words[index].length() - 1);

        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && words[i].charAt(0) == lastChar) {
                if (canFormWordChain(words, visited, i, count + 1)) {
                    return true;
                }
            }
        }

        visited[index] = false; // 백트래킹
        return false;
    }

    public static void main(String[] args) {
        끝말잇기 wc = new 끝말잇기();
        String[] words = {"apple", "everyone", "element", "truck", "kite"};
        System.out.println(wc.solution(5, words)); // "Yes"
    }
}
