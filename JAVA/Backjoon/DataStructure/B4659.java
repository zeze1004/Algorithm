import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B4659 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<String> list = new ArrayList<>();
        String str = "";
        while (!str.equals("end")) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                str = st.nextToken();
                list.add(str);
            }
        }

        for (String s : list) {
            if (s.equals("end")) return;
            // 1번 조건
            if (!s.contains("a") && !s.contains("e") && !s.contains("i") && !s.contains("o") && !s.contains("u")) {
                System.out.println("<" + s + "> is not acceptable.");
                continue;
            }

            // 2번 조건
            boolean canPassword = true;
            int mouemCount = 0;
            int zauemCount = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    mouemCount++;
                    zauemCount = 0;
                } else {
                    zauemCount++;
                    mouemCount = 0;
                }

                if (mouemCount == 3 || zauemCount == 3) {
                    canPassword = false;
                    break;
                }

                // 3번 조건
                if (i > 0 && c == s.charAt(i - 1) && (c != 'e' && c != 'o')) {
                    canPassword = false;
                    break;
                }
            }
            if (canPassword) {
                System.out.println("<" + s + "> is acceptable.");
            } else {
                System.out.println("<" + s + "> is not acceptable.");
            }
        }
    }
}
