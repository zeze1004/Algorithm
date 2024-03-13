import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P77484 {

    public static void main(String[] args) {
        int[] lottos = {31, 10, 2, 18, 5, 3};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(lotto(lottos, win_nums)));
    }

    private static int[] lotto(int[] lottos, int[] win_nums) {

        List<Integer> myLotto = new ArrayList<>();
        List<Integer> winLotto = new ArrayList<>();

        for (int i = 0; i < lottos.length; i++) {
            myLotto.add(lottos[i]);
            winLotto.add(win_nums[i]);
        }

        Collections.sort(myLotto);
        Collections.sort(winLotto);

        int matching = 0;

        if (myLotto.contains(0)) {
            int frequency = Collections.frequency(myLotto, 0);
            if (frequency == 6) {
                return new int[] {1, 6};
            } else {
                // 0이 4개 이하인 lotto
                myLotto.subList(frequency, myLotto.size()); // 0 원소 자르기
                for (Integer i : myLotto) {
                    for (Integer lotto : winLotto) {
                        if (i.equals(lotto)) {
                            matching++;
                            break;
                        }
                    }
                }
                int[] res = new int[2];
                int resMax = matching + frequency;
                int resMin = matching;

                switch (resMax) {
                    case 6: res[0] = 1;
                        break;
                    case 5: res[0] = 2;
                        break;
                    case 4: res[0] = 3;
                        break;
                    case 3: res[0] = 4;
                        break;
                    case 2: res[0] = 5;
                        break;
                    case 1, 0: res[0] = 6;
                        break;
                }

                switch (resMin) {
                    case 6: res[1] = 1;
                        break;
                    case 5: res[1] = 2;
                        break;
                    case 4: res[1] = 3;
                        break;
                    case 3: res[1] = 4;
                        break;
                    case 2: res[1] = 5;
                        break;
                    case 1, 0: res[1] = 6;
                        break;
                }

                System.out.println(Arrays.toString(res));
                return res;
            }
        }

        // 0이 없는 경우, 당첨 최대 최소 경우의 수가 동일힘
        for (Integer i : myLotto) {
            for (Integer lotto : winLotto) {
                if (i.equals(lotto)) {
                    matching++;
                    break;
                }
            }
        }

        switch (matching) {
            case 6: return new int[] {1, 1};
            case 5: return new int[] {2, 2};
            case 4: return new int[] {3, 3};
            case 3: return new int[] {4, 4};
            case 2: return new int[] {5, 5};
            case 1: return new int[] {6, 6};
            case 0: return new int[] {6, 6};
        }



        return null;
    }
}
