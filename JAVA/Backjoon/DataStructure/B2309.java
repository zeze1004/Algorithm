import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2309 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] heights = new int[9];
        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
        }

        int num = 0;

        for (int i = 0; i < heights.length; i++) {
            num = 100 - heights[i];
            for (int j = 0; j < i; j++) {
                num = num - heights[j];
                if (num == 0)
                    return;

            }
        }
    }
}
