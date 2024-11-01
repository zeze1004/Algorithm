class Solution {
    public String makeFancyString(String s) {
        if (s.length() == 1) return s;

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));
        
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == sb.charAt(sb.length() - 1) && s.charAt(i) == sb.charAt(sb.length() - 2)) {
                continue;
            }
            sb.append(s.charAt(i));
        }    
        
        return sb.toString();
    }
}