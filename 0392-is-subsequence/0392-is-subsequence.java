class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_idx = 0, t_idx = 0;
        int count = 0;
        while (s.length() - s_idx > 0 && t.length() - t_idx > 0) {
            char tmp = s.charAt(s_idx);
            if (tmp == t.charAt(t_idx)) {
                count++;
                s_idx++; t_idx++;
            }
            else t_idx++;
        }
        
        if (count == s.length()) return true;
        else return false;
    }
}