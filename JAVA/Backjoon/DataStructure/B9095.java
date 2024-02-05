import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class B9095 {
    static int cnt, N;
    public static void DFS(int sum){
        System.out.println("DFS(" + sum + ")" + " 시작");
        for(int i=1; i<=3; i++){
            System.out.print("DFS(" + sum + ")의 " + "반복문 i: " + i + " / ");
            if(sum+i<N){
                DFS(sum+i);
            } else if (sum+i==N) {
                cnt++;
                System.out.println("count: " + cnt + " sum: " + sum + " i: " + i + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-->0){
            N = Integer.parseInt(br.readLine());
            cnt = 0;
            DFS(0);
            bw.write(String.valueOf(cnt)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
