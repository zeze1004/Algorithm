import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B4659_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<String> list = new ArrayList<>();

        String input = "";
        while (!input.equals("end")) {
            st = new StringTokenizer(br.readLine());
            input = st.nextToken();
            list.add(input);
        }

        for (String s : list) {
            if (s.equals("end")) return;

            boolean isValid = true;
            int mouem = 0;
            int jauem = 0;

            if (!s.contains("a") && !s.contains("e") && !s.contains("i") && !s.contains("o") && !s.contains("u")) {
                System.out.println("<" + s + ">" + " is not acceptable.");
                continue;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                    jauem++;
                    mouem = 0;
                } else {
                    mouem++;
                    jauem = 0;
                }

                if (jauem == 3 || mouem == 3) {
                    isValid = false;
                }
                if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    if (s.charAt(i) != 'e' && s.charAt(i) != 'o') {
                        isValid = false;
                        break;
                    }
                }

            }
            if (isValid) System.out.println("<" + s + ">" + " is acceptable.");
            else System.out.println("<" + s + ">" + " is not acceptable.");
        }
    }
}
