import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        solution(array, commands);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            // 새로운 배열 선언
            List<Integer> arrSort = new ArrayList<>(array.length);

            int indexFirst = commands[i][0] - 1;
            int indexLast = commands[i][1] - 1;
            int ansNum = commands[i][2] - 1;

            // 커맨드에 따라서 새로운 배열에 값 추가
            for (int j = indexFirst; j <= indexLast; j++) {
                arrSort.add(array[j]);
            }

            Collections.sort(arrSort);

            // 정렬 후 커맨드[2] 추출해서 answer에 저장
            answer[i] = arrSort.get(ansNum);
        }

        return answer;
    }
}
