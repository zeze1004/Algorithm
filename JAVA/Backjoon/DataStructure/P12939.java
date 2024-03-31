import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P12939 {
    public static void main(String[] args) {

        String s = "5 8 2 7 4 3 -100 -1004";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        List<Integer> list = new ArrayList<>();
        String answer = "";

        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            list.add(Integer.valueOf(str[i]));
        }

        return Collections.min(list) + " " + Collections.max(list);
    }
}
