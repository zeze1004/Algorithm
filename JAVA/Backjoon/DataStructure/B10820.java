import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while ((str = br.readLine()) != null) {
            int lowwer = 0;
            int upper = 0;
            int number = 0;
            int nullNum = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (Character.isUpperCase(ch)) {   // 대문자일 경우
                    upper++;
                } else if (Character.isLowerCase(ch)) { // 소문자일 경우
                    lowwer++;
                } else if (str.charAt(j) == ' ') { // 공백일 경우
                    nullNum++;
                } else {    // 숫자일 경우
                    number++;
                }
            }
            System.out.println(lowwer + " " + upper + " " + number + " " + nullNum);
        }
        br.close();
    }
}
