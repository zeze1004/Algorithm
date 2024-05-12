class Solution {
    public int findPermutationDifference(String s, String t) {
        int output = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                char b = t.charAt(j);
                if (a == b) output += Math.abs(i - j);
            }
        }   
        return output;
    }
}