import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class B17413 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        // System.out.println(st);
        // String st = "<ab cd>ef gh<ij kl>";

        Deque<Character> deque = new ArrayDeque<>();
        boolean flag = false;

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '<') {
                flag = true;
                while (!deque.isEmpty()) {
                    System.out.print(deque.removeLast());
                }
                deque.add(st.charAt(i));
            } else if (st.charAt(i) == ' ' && !flag) {
                while (!deque.isEmpty()) {
                    System.out.print(deque.removeLast());
                }
                System.out.print(" ");
            } else if (st.charAt(i) == '>') {
                deque.add(st.charAt(i));
                // if (deque.peekFirst() != '<')
                //     System.out.print('<');
                while (!deque.isEmpty()) {
                    System.out.print(deque.removeFirst());
                }
                flag = false;
            } else {
                deque.add(st.charAt(i));
            }
        }
        while (!deque.isEmpty()) {
            System.out.print(deque.removeLast());
        }
    }
}
