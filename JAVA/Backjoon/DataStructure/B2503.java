import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2503 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[988];
        String compare_num;

        // 모든 경우의 수를 만들어놓음
        for (int i = 123; i <= 987; i++) {
            compare_num = String.valueOf(i);

            // 세자리 수 중복된 수가 있으면 경우의 수에서 제외
            if (compare_num.charAt(0) == compare_num.charAt(1) || compare_num.charAt(0) == compare_num.charAt(2)
                || compare_num.charAt(1) == compare_num.charAt(2)) continue;
            // 0이 들어간 수도 제외
            if (compare_num.charAt(0) == '0' || compare_num.charAt(1) == '0' || compare_num.charAt(2) == '0') continue;
            arr[i] = true;
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String num = st.nextToken();
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());


            for (int j = 123; j <= 987; j++) {
                int ball_cnt = 0;
                int strike_cnt = 0;
                if (arr[j]) {
                    compare_num = String.valueOf(j);

                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (x == y && num.charAt(x) == compare_num.charAt(y)) {
                                strike_cnt++;
                            } else if (x != y && num.charAt(x) == compare_num.charAt(y)) {
                                ball_cnt++;
                            }
                        }
                    }

                    arr[j] = strike_cnt == strike && ball_cnt == ball;
                }
            }
        }

        int res = 0;

        for (int i = 123; i <= 987; i++) {
            if (arr[i]) res++;
        }
        System.out.println(res);
    }
}
