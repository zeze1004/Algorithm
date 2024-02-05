import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        if (num == 1) {
            return;
        }

        int count = 2;

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                num = num / i;
                System.out.println(i);
            }
        }
    }
}
