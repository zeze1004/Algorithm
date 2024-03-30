import java.util.LinkedList;
import java.util.Queue;


public class P118667 {
    public static void main(String[] args) {
        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};

        System.out.println(solution(queue1, queue2));
    }

    public static int solution(int[] queue1, int[] queue2) {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0;
        long sum2 = 0;

        for(int n : queue1){
            q1.add(n);
            sum1 += n;
        }

        for(int n : queue2){
            q2.add(n);
            sum2 += n;
        }

        int cnt = 0;
        int maxIdx = (queue1.length + queue2.length) * 2; // queue1과 queue2 모두 순회한 경우의 수

        while(cnt <= maxIdx){
            if(sum1 == sum2){
                return cnt;
            } else if(sum1 > sum2){
                int poll = q1.poll();
                sum1 -= poll;
                sum2 += poll;
                q2.add(poll);
            }else {
                int poll = q2.poll();
                sum2 -= poll;
                sum1 += poll;
                q1.add(poll);
            }
            cnt++;
        }

        return -1;
    }
}
