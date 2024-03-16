import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2563_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        boolean[][] papers = new boolean[101][101];

        int count = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int n = x; n < x + 10; n++) {
                for (int m = y; m < y + 10; m++) {
                    if (papers[n][m]) count++;
                    else papers[n][m] = true;
                }
            }
        }

        System.out.println(100 * num - count);
    }
}
