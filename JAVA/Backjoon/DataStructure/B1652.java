import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1652 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[][] room = new String[num][num];

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken("");
            String[] str = tmp.split("");
            for (int j = 0; j < num; j++) {
                room[i][j] = str[j];
            }
        }
        // for (String[] strings : room) {
        //     System.out.println(Arrays.toString(strings));
        // }

        int sequence = 0;
        int garo_cnt = 0;
        int sero_cnt = 0;

        for (int i = 0; i < num; i++) {
            for (int y = 0; y < num; y++) {
                if (room[i][y].equals(".")) {
                    sequence++;
                    if (sequence == 2) garo_cnt++;  // 연속으로 .이 2번 나오면 가로 누울자리 1 증가
                } else sequence = 0;
            }
            sequence = 0;

            for (int x = 0; x < num; x++) {
                if (room[x][i].equals(".")) {
                    sequence++;
                    if (sequence == 2) sero_cnt++;
                } else sequence = 0;
            }

            sequence = 0;
        }

        System.out.println(garo_cnt + " " + sero_cnt);
    }
}
