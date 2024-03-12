import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class B1158 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> deque = new LinkedList<>();

        int dequeSize = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());

        List<Integer> resList = new ArrayList<>(dequeSize);

        for (int i = 1; i <= dequeSize; i++) {
            deque.add(i);
        }

        while (!deque.isEmpty()) {

            for (int i = 0; i < index; i++) {
                if (i == (index - 1)) {
                    resList.add(deque.removeFirst());
                }
                else deque.add(deque.removeFirst());
            }
        }

        System.out.print("<");
        for (int i = 0; i < resList.size(); i++) {
            if (i == resList.size() - 1) {
                System.out.print(resList.get(i));
                break;
            }
            System.out.print(resList.get(i) + ", ");
        }
        System.out.print(">");
    }
}
