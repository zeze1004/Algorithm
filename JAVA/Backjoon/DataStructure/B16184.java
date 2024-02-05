import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B16184 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        List<Integer> cards = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            cards.add(br.read());
            System.out.println(cards.get(i));
        }
    }
}
