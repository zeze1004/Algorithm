import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1343 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder board = new StringBuilder(br.readLine());
        StringBuilder ans = new StringBuilder();

        int count = 0;
        for (int i = 0; i < board.length();) {
            if (board.charAt(i) == '.') {
                count = 0;
                ans.append('.');
                i++;
            } else {
                while (i < board.length() && board.charAt(i) == 'X') {
                    count++; i++;
                }
                if (count == 2) ans.append("BB");
                else if (count == 4) ans.append("AAAA");
                else if (count % 4 == 2) {
                    for (int j = 4; j < count; j+=4)
                        ans.append("AAAA");
                    ans.append("BB");
                } else if (count % 4 == 0) {
                    for (int j = 4; j <= count; j+=4)
                        ans.append("AAAA");
                } else {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(ans);
    }
}
