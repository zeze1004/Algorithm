import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B11052 {
    public static void main(String[] args) throws IOException {
        List<Integer> dp = new ArrayList<>();
        List<Integer> cards = new ArrayList<>();

        dp.add(0);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            dp.add(Integer.parseInt(str));
            cards.add(Integer.parseInt(str));
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                dp.set(i, Math.max(dp.get(i), dp.get(j) + cards.get(i - j - 1)));
            }
        }
        System.out.println(dp.get(N));
    }
}
