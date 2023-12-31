import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

import com.sun.jdi.CharType;

public class Retry9093 {
    public static void main(String[] args) throws IOException {
        String str = "사과 바나나 망고 참외";

        ArrayDeque<Character> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if (tmp == ' ') {
                while (!deque.isEmpty()) {
                    sb.append(deque.pollFirst()); // poll
                }
                sb.append(tmp);
            } else {
                deque.addFirst(tmp);
            }
        }
        while (!deque.isEmpty()) {
            sb.append(deque.pollFirst()); // 참외 다음에 공백이 없어서
        }
        System.out.println(sb.toString());
    }
}
