import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        List<Integer> list = new ArrayList<>(Collections.nCopies(26, -1));

        for (int i = 0; i < str.length(); i++) {
            if (list.get(str.charAt(i)- 'a') == -1)
                list.set(str.charAt(i) - 'a', i);
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
