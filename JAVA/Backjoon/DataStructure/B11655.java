import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = (char)(str.charAt(i) + 13);

            if (str.charAt(i) <= 'Z' && ch > 'Z') { // 대문자이고, 대문자를 벗어난
                ch = (char)(ch - 'Z' + '@');        // A - 1 = @
            } else if (str.charAt(i) <= 'z' && ch > 'z') { // 소문자이고, 소문자를 벗어난(z 보다 큰 경우)
                ch = (char)(ch - 'z' + '`');        // a - 1 = '
            } else if (str.charAt(i) == ' ') {
                ch = ' ';
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                ch = str.charAt(i);
            }

            System.out.print(ch);
        }
    }
}
