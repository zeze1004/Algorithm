import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class stack28278 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> stack = new ArrayList<Integer>(1000000);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String command;

        int len =0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();

            switch (command) {
                case "1":
                    stack.add(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    len = stack.size();
                    if (len == 0)
                        sb.append(-1).append("\n");
                    else {
                        sb.append(stack.remove(len-1)).append("\n");
                    }
                    break;
                case "3":
                    len = stack.size();
                    sb.append(len).append("\n");
                    break;
                case "4":
                    len = stack.size();
                    if (len == 0)
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case "5":
                    len = stack.size();
                    if (len == 0)
                        sb.append(-1).append("\n");
                    else
                        sb.append(stack.get(len - 1)).append("\n");
                    break;
            }
        }
        br.close();

        System.out.println(sb);
    }
}
