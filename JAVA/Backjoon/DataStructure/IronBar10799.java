import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class IronBar10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<String> st = new Stack<>();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push(String.valueOf('('));
            } else {
                if (str.charAt(i - 1) == '(') { // 레이저라면
                    st.pop();
                    count += st.size();

                } else {
                    count++;
                    st.pop();
                }
            }
        }
        System.out.println(count);
    }
}
