import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseWord2_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 입력
        String str = br.readLine();

        // 뒤집어진 결과값을 담을 문자열
        StringBuilder sb = new StringBuilder();

        // 열린 꺽새와 닫힌 꺽새 구별할 플래그
        boolean flag = false;

        Stack<Character> stack = new Stack<>();

        // 문자열 길이만큼 반복문 수행
        for (int i = 0; i < str.length(); i++) {
            // 열린 꺽쇄를 만나면 flag = true, 닫힌 꺽쇄는 false

            // 열린 꺽새를 만났을 때, stack이 비어있지 않다면
            // 이전에 stack에 담은 문자들을 pop(뒤집기) 그리고 flag를 true
            if (str.charAt(i) == '<') {
                flag = true;
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(str.charAt(i));
            }

            // 닫힌 꺽새를 만났을 경우, flag를 false로 입력 후 '>' 저장
            else if (str.charAt(i) == '>') {
                flag = false;
                sb.append(str.charAt(i));
            }

            // flag가 true일 경우, '>'를 만나기 전까지 그대로 입력
            else if (flag) {
                sb.append(str.charAt(i));
            }

            // flag가 false일 경우
            else if (!flag) {
                // i번째 문자가 공백일 경우
                if (str.charAt(i) == ' ') {
                    // 공백 전에 담아둔 스택의 문자를 다 가져옴(뒤집기)
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(str.charAt(i)); // 공백 추가
                } else {
                    stack.push(str.charAt(i));
                }
            }
        }

        // 마지막 단어는 stack push만 하고 끝나므로 while문 추가
        // stack 비어있지 않다면 문자 추가
        while (!stack.empty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
    }
}
