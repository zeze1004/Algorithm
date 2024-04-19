import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B2331_review {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        list.add(A);

        while (true) {
            String num = String.valueOf(list.get(list.size() - 1));
            int tmp = 0;
            for (int i = 0; i < num.length(); i++) {
                tmp += (int)Math.pow(num.charAt(i) - '0', P);
            }
            if (list.contains(tmp)) {
                int idx = list.indexOf(tmp);
                System.out.println(idx);
                return;
            }
            list.add(tmp);
        }
    }
}
