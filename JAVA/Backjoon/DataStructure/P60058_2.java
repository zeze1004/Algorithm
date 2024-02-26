import java.util.Stack;

public class P60058_2 {


    public static String solution(String p) {
        if (p.isEmpty()) return "";
        else if (checkRightBrackets(p)) {
            return p;
        } else return splitBrackets(p);
    }
    private static String splitBrackets(String p) {

        // 균형잡힌 괄호 문자열로 분리하기
        int countOpenBracket = 0, idx = 0; // ( 수 카운팅
        for (idx = 0; idx < p.length(); idx++) {
            countOpenBracket += p.charAt(idx) == '(' ? 1 : -1;
            if (countOpenBracket == 0) break;
        }

        String u = p.substring(0, idx + 1);
        String v = p.substring(idx + 1);

        if (checkRightBrackets(u)) return u + solution(v);

        StringBuilder sb = new StringBuilder();
        sb.append('(').append(solution(v)).append(')');
        for (int i = 1; i < u.length() - 1; i++) {
            // ( 와 )를 reverse
            sb.append(u.charAt(i) == '(' ? ')' : '(');
        }

        return sb.toString();

    }

    private static boolean checkRightBrackets(String p) {
        int sum = 0;
        for (char c : p.toCharArray()) {
            if (c == '(') {
                sum++;
            } else {
                if (sum == 0) return false;
                sum--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String p = ")()()(()())(";

        System.out.println(solution(p));
    }

}
