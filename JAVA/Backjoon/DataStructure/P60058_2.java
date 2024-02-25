import java.util.Stack;

public class P60058_2 {


    public static String solution(String p) {
        if (p.isEmpty()) return "";
        else if (checkRightBrackets(p)) {
            return p;
        } else return splitBrackets(p);
    }
    private static String splitBrackets(String p) {
        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();

        // 균형잡힌 괄호 문자열로 분리하기
        int countOpenBracket = 0; // ( 수 카운팅
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(')
                countOpenBracket++;
            else
                countOpenBracket--;

            if (countOpenBracket == 0) {
                u.append(p, 0, i + 1);          // 균형잡힌 문자열 분리
                v.append(p.substring(i + 1));

                // 올바른 괄호 문자열 비교
                if (checkRightBrackets(String.valueOf(u))) {
                    u.append(splitBrackets(String.valueOf(v)));
                // 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
                } else {
                    StringBuilder new_u = new StringBuilder();
                    // 4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
                    new_u.append('(');
                    // 4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
                    new_u.append(splitBrackets(String.valueOf(v)));
                    // 4-3. ')'를 다시 붙입니다.
                    new_u.append(')');

                    new_u.append(modifyBracketsU(String.valueOf(u)));
                    return String.valueOf(new_u);
                }
                break;
            }
        }

        // 4-5. 생성된 문자열을 반환합니다.
        return String.valueOf(u);
    }

    // 4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
    private static String modifyBracketsU(String u) {
        StringBuilder tmp = new StringBuilder();

        // 처음과 끝은 제외하고 반환
        for (int i = 1; i < u.length() - 1; i++) {
            // reverse
            if (u.charAt(i) == '(') tmp.append(')');
            else tmp.append('(');
        }

        return String.valueOf(tmp);
    }

    private static boolean checkRightBrackets(String u) {
        Stack<Character> stacks = new Stack<>();
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') stacks.add('(');
            else {
                if (stacks.isEmpty()) return false;
                stacks.pop();
            }
        }

        return stacks.isEmpty();
    }

    public static void main(String[] args) {
        String p = ")()()(()())(";

        System.out.println(solution(p));
    }

}
