import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P42889 {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        for (int stage : stages) {
            list.add(stage);
        }

        Collections.sort(list);

        solution(N, stages);

    }
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        long allUserNum = stages.length;
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 1; i < N; i++) {
            long stageUserNum = Collections.frequency(list, i);
            if (stageUserNum != 0) {
                double tmp = (double)stageUserNum / allUserNum;
                map.put(i, tmp);
                allUserNum -= stageUserNum;
            }
            else {
                map.put(i, (double)0);
            }
        }

        long lastStageUserNum = Collections.frequency(list, N) + Collections.frequency(list, N + 1);
        if (lastStageUserNum != 0) {
            double tmp = (double)Collections.frequency(list, N) / lastStageUserNum;
            map.put(N, tmp);
        } else {
            map.put(N, (double)0);
        }


        List<Integer> keys = new ArrayList<>(map.keySet());

        keys.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        Integer tmp; int i = -1;
        for (Integer key : keys) {
            i++;
            tmp = key;
            answer[i] = tmp;
            System.out.print(answer[i]);
        }

        return answer;
    }
}
