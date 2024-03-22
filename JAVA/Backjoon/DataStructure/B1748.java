import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1748 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st_nums = br.readLine();
        int nums = Integer.parseInt(st_nums);

        int num_lenth = 1;
        int sum = 0;
        int divider = 10;

        for (int i = 1; i <= nums; i++) {

            if (i % divider == 0) {  // i가 10이 될 때
                num_lenth++;         // 2의 자릿수가 된다
                divider *= 10;       // 100
            }

            sum += num_lenth;        // 10의 길이인 2를 추가
        }

        System.out.println(sum);

    }
}
