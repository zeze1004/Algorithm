class Solution {
    public boolean backspaceCompare(String s, String t) {

        // 이거 stack이다...!
        Deque<Character> stackS = new ArrayDeque<Character>();
        Deque<Character> stackT = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (stackS.size() > 0 && s.charAt(i) == '#') stackS.pop();
            else if (s.charAt(i) != '#') stackS.push(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            if (stackT.size() > 0 && t.charAt(i) == '#') stackT.pop();
            else if (t.charAt(i) != '#') stackT.push(t.charAt(i));
        }

        if (stackS.size() != stackT.size()) return false;

        while(!stackS.isEmpty()) {
            // System.out.println(stackS.getFirst() + " " + stackT.getFirst());
            if (stackS.pollFirst() != stackT.pollFirst()) return false;
        }

        return true;
    }
}