import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fibo(n));
    }

    public static int fibo(int num) {
        if (num - 1 == 0 || num == 0) {
            return 1;
        }
        return num * fibo(num - 1);
    }
}
