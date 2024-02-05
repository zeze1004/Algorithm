import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int peopleNum = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'S') {
                count++;
            } else {
                count++;
                i++;
            }
        }
        System.out.println(Math.min(peopleNum, count));
    }
}
