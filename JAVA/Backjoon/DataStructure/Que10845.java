import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Que10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int last = 0;

        for (int i = 0; i < num; i++) {
            String str = st.nextToken();
            switch (str) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    que.add(last);
                    break;
                case "pop":
                    if (que.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(que.poll()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(que.size()).append("\n");
                    break;
                case "empty":
                    if (que.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "front":
                    if (que.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(que.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (que.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(last).append("\n");
                    }
                    break;
            }
            System.out.println(sb);
        }
    }
}

