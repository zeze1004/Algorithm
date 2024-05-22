class Solution {
    public boolean judgeCircle(String moves) {
        int U = 0, D = 0, L = 0, R = 0;
        
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') D++;
            if (moves.charAt(i) == 'D') U++;
            if (moves.charAt(i) == 'L') R++;
            if (moves.charAt(i) == 'R') L++;
        }

        return U == D && R == L;
    }
}