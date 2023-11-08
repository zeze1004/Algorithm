import java.util.Stack;
import java.lang.String;

public class MinRemoveToMakeValid1249 {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();

        char[] charArray = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (!stack.empty() && s.charAt(i) == ')') {
                charArray[i] = '!';             // '(' == '!'
                charArray[stack.pop()] = '?';   // ')' == '?'
            }
        }
        s = String.valueOf(charArray);

        s = s.replace("(", "");
        s = s.replace(")", "");
        s = s.replace("?", "(");
        s = s.replace("!", ")");

        return s;
    }
}
