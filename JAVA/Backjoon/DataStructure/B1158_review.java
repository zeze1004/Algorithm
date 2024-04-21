import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1158_review {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 1; i <= N; i++) deque.add(i);

        while (!deque.isEmpty()) {
            for (int i = 0; i < K; i++) {
                if (i == K - 1) {
                    ans.append(deque.removeFirst());
                    break;
                }
                deque.add(deque.removeFirst());
            }
        }
        System.out.print("<");
        for (int i = 0; i < ans.length() - 1; i++) {
            System.out.printf("%c, ", ans.charAt(i));
        }
        System.out.printf("%c", ans.charAt(ans.length() - 1));
        System.out.print(">");
    }
}
