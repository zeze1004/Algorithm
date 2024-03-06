import java.io.IOException;
import java.util.TreeSet;

public class B4673 {
    public static void main(String[] args) throws IOException {
        TreeSet<Integer> unSelfNum = new TreeSet<>();

        for (int i = 1; i <= 10000; i++) {
            unSelfNum.add(splitAndSumDigit(i));
        }

        for (int i = 1; i <= 10000; i++) {
            if (!unSelfNum.contains(i))
                System.out.println(i);
        }

    }

    // 반복문으로 수를 10으로 계속 나누워 모든 자릿수의 값을 하나 씩 더하는 풀이
    public static int splitAndSumDigit(int num) {
        int sum  = num;

        while (num != 0) {
            sum += num % 10; // 일의 자리 수 더하기
            num /= 10;       // 기존 일의 자리 수를 제거하여 앞의 수가 일의 자리로 옴
        }

        return sum;
    }

    // 숫자를 문자로 받아서 문자열 split 후 전체 합하는 방식의 풀이
    public static int SplitStr(int num) {

        String numS = String.valueOf(num);
        String[] numSplit = numS.split("");

        int sum = num;
        for (String s : numSplit) {
            sum += Integer.parseInt(s);
        }

        return sum;
    }

}
