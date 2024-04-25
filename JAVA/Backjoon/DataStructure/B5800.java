import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class B5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            TreeSet<Integer> set = new TreeSet<>();
            for (int j = 0; j < student; j++) set.add(Integer.parseInt(st.nextToken()));

            int gap = 0, tmp = set.first();
            for (Integer s : set) {
                gap = Math.max(s - tmp, gap);
                tmp = s;
            }

            System.out.printf("Class %d\n", i);
            System.out.printf("Max %d, Min %d, Largest gap %d\n", set.last(), set.first(), gap);
        }
    }
}
