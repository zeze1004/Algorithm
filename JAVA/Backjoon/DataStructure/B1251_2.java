import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B1251_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 1; i < sb.length() - 1; i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                StringBuilder reverseWord1 = new StringBuilder(sb.substring(0, i));
                StringBuilder reverseWord2 = new StringBuilder(sb.substring(i, j));
                StringBuilder reverseWord3 = new StringBuilder(sb.substring(j));

                list.add(reverseWord1.reverse().toString() + reverseWord2.reverse().toString() + reverseWord3.reverse().toString());
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
