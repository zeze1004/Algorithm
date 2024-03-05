import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] croAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String alpha : croAlpha) {
            input = input.replace(alpha, "0");
        }

        System.out.println(input.length());
    }
}
