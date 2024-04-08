import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B2331 {
    public static void main(String[] args) throws IOException {

        List<Integer> countList = new ArrayList<>();
        for (int i = 0; i < 236196 + 1; i++) {                  // 최대수는 A = 9999, P = 5로 (9^5) * 4 = 236196
            countList.add(0);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] A = br.readLine().split("");
        int P = Integer.parseInt(A[A.length - 1]);              // ex. [5, 7, , 2];

        // 수열 시작값 list에 넣기
        StringBuilder firstNum = new StringBuilder();
        for (int i = 0; i < A.length - 2; i++) {
            firstNum.append(A[i]);
        }

        countList.set(Integer.parseInt(firstNum.toString()), 1); // 첫번째 수 카운트 1

        // 두 번째 수열값 list에 넣기
        long num = 0;
        for (int i = 0; i < A.length - 2; i++) {
            num += (long)Math.pow(Double.parseDouble(A[i]), P);
        }
        countList.set((int)num, 1);                             // 두번째 수 카운트 1

        String[] splitNum = Long.toString(num).split("");
        while (!countList.contains(3)) {                        // 동일한 수가 3번 카운팅되면 반복된 수열 한 사이클이 끝났다고 판단하여 반복문 탈출
            num = 0;
            for (String s : splitNum) {
                num += (long)Math.pow(Double.parseDouble(s), P); // num += splitNum[i]^P
            }

            countList.set((int)num, countList.get((int)num) + 1); // 기존 카운팅 값에 1 증가

            splitNum = Long.toString(num).split("");
        }

        int count = 0;
        for (Integer i : countList) {
            if (i == 1) count++;
        }
        System.out.println(count);
    }
}
