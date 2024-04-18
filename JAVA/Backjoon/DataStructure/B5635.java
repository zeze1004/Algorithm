import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> birthList = new ArrayList<>();

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String day = st.nextToken();
            if (day.length() == 1) {
                day = "0" + day;
            }
            String month = st.nextToken();
            if (month.length() == 1) {
                month = "0" + month;
            }
            String year = st.nextToken();

            String tmp = year + month + day + name;
            birthList.add(tmp);
        }
        Collections.sort(birthList);

        StringBuilder sb = new StringBuilder(birthList.get(num - 1));
        sb.replace(0, 8, "");
        System.out.println(sb);

        sb = new StringBuilder(birthList.get(0));
        sb.replace(0, 8, "");
        System.out.println(sb);
    }
}
