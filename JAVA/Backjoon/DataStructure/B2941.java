import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(revertCroAlpha(input));
    }

    private static int revertCroAlpha(String input) {

        while (!input.isEmpty()) {
            if (input.contains("c=")) {
                input = input.replace("c=", "0");
            }
            if (input.contains("c-")) {
                input = input.replace("c-", "0");
            }
            if (input.contains("dz=")) {
                input = input.replace("dz=", "0");
            }
            if (input.contains("d-")) {
                input = input.replace("d-", "0");
            }
            if (input.contains("lj")) {
                input = input.replace("lj", "0");
            }
            if (input.contains("nj")) {
                input = input.replace("nj", "0");
            }
            if (input.contains("s=")) {
                input = input.replace("s=", "0");
            }
            if (input.contains("z=")) {
                input = input.replace("z=", "0");
            }
            break;
        }
        return input.length();
    }
}
