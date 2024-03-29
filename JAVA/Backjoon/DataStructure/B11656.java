import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> stringList = new ArrayList<>();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            String subStr = str.substring(i);
            stringList.add(subStr);
        }

        // 정렬
        Collections.sort(stringList);

        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
