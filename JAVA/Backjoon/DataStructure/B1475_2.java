import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1475_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int[] count = new int[10];

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) - '0' == 9)  {
                count[6]++;
            }
            else count[num.charAt(i) - '0']++;
        }

        count[6] = (count[6] + 1) / 2;

        int max = 0;
        for (int i : count) {
            max = Math.max(max, i);
        }

        System.out.println(max);
    }
}
