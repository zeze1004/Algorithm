import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11054 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        int[] dpUp = new int[num];
        int[] dpDown = new int[num];
        int[] dpAns = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 증가 수열 dp
        for (int i = 0; i < num; i++) {
            dpUp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr [j]) {
                    if (dpUp[j] + 1 >= dpUp[i]) {
                        dpUp[i] = dpUp[j] + 1;
                    }
                }
            }
        }

        // 감소 수열 dp
        for (int i = num - 1; i >= 0; i--) {
            dpDown[i] = 1;
            for (int j = num - 1; j > i; j--) {
                if (arr[i] > arr [j]) {
                    if (dpDown[j] + 1 >= dpDown[i]) {
                        dpDown[i] = dpDown[j] + 1;
                    }
                }
            }
        }

        // 증가 수열 dp + 감소 수열 dp
        for (int i = 0; i < num; i++) {
            dpAns[i] = dpUp[i] + dpDown[i];
        }

        int count = 0;
        for (int i : dpAns) {
            count = Math.max(count, i);
        }
        System.out.println(count - 1);
    }
}
