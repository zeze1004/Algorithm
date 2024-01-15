import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B1676 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long ansCount = 0;

        String ansFactorial = String.valueOf(factorial(n));
        // System.out.println(ansFactorial);

        for (int i = ansFactorial.length() - 1; i >= 0; i--) {
            if ((char)ansFactorial.charAt(i) != '0') {
                System.out.println(ansCount);
                return;
            } else {
                ansCount++;
            }
        }
    }

    public static BigInteger factorial(int num) {
        if (num - 1 == 0 || num == 0) {
            return BigInteger.valueOf(1);
        }
        return factorial(num - 1).multiply(BigInteger.valueOf(num));
    }
}
