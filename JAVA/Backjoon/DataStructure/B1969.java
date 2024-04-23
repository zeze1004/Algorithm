import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class B1969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<String> list = new ArrayList<>();
        TreeMap<Character, Integer> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            for (String s : list) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
            char tmpChar = '?';
            int tmpInt = 0;

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (tmpInt < entry.getValue()) {
                    tmpInt = entry.getValue();
                    tmpChar = entry.getKey();
                }
            }
            sb.append(tmpChar);
            map.clear();
        }
        System.out.println(sb);

        int count = 0;
        for (int i = 0; i < M; i++) {
            for (String s : list) {
                if (s.charAt(i) != sb.charAt(i)) count++;
            }
        }
        System.out.println(count);
    }
}
