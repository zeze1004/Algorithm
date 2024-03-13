import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B2161 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
            if (queue.isEmpty())
                return;
            queue.add(queue.remove());
        }
    }
}
