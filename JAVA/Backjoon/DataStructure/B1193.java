import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        int num = Integer.parseInt(br.readLine());
        int PatternCount = 0;
        // int count = 0;
        int startNum = -1;

        if (num == 1) {
            System.out.println("1/1");
            return;
        } else if (num == 2) {
            System.out.println("1/2");
            return;
        } else if (num == 3) {
            System.out.println("2/1");
            return;
        } else if (num == 4) {
            System.out.println("3/1");
            return;
        } else if (num == 5) {
            System.out.println("2/2");
            return;
        }
        // 5 -> 9 -> 13 4씩 증가
        for (int i = 5; i <= 10000000; i += 4) { // 4씩 증가 반복문
            // count++;
            startNum += 2;      // 시작하는 홀수를 뜻함 1 -> 3 -> 5 (1/3) 결론: 2번째 패턴의 시작 홀수는 3이다. 1/3로 시작한다는걸 알 수 있음~
            PatternCount += i;  // 5 -> 9 -> 13 -> 17 패턴의 개수를 저장함, 가령 6,7,8,9,10,11,12,13,14 (9개)
            if (num <= PatternCount) {
                // System.out.println(PatternCount);
                // System.out.println(startNum);
                break;
            }
        }

        list.add("1/" + startNum);              // "1/3"
        list.add("1/" + (startNum + 1));        // "1/4"
        // list.add("2/" + (startNum));

        int bunmo = startNum + 1;               // 4를 저장함

        // 왼쪽 아래 대각선의 분수들을 리스트에 저장함
        for (int i = 2; i <= (startNum + 1); i++) { // 3번째부터는 무조건 분자가 2로 시작함 ex. 두 번째 1/3, 1/4 좌하락대각선?을 구하는 반복문 2부터 시작해서 (분모의 수 - 1)번째까지만 대각선의 수가 있어요.
                                                                                                        // 2/3(3번째), 3/2(4번째), 4/1(5번째) =>왼쪽으로 내려가는 대각선은 무조건 2번째 수의 분모의수 - 1 의 갯수를 가짐
                                                                                                        // 직선 아래인 5/1 (6번째)

            list.add(i + "/" + --bunmo);
        }

        list.add((startNum + 2) + "/" + "1"); // 1/3 시작이라면, 외쪽 대각선의 끝이 4/1고 직선으로 내려간 수는 무조건 5/1 (시작하는 수 + 2) / 1 이다.

        int bunmo2 = 1;

        // 오른쪽 대각선 위로 올라가기
        for (int i = (startNum + 1); i >= 2; i--) {
            list.add(i + "/" + ++bunmo);
        }

        // ?ㅁ?
        System.out.println(list.get(list.size() - (PatternCount - num) - 1));

        for (String s : list) {
            System.out.println(s);
        }

    }
}
