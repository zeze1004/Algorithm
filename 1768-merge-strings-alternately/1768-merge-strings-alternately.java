class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder output = new StringBuilder();
        int w1 = 0, w2 = 0;
        
        while (true) {
            if (word1.length() == w1 && word2.length() == w2) break;
            if (word1.length() > w1) {
                output.append(word1.charAt(w1));
                w1++;
            } 
            if (word2.length() > w2) {
                output.append(word2.charAt(w2));
                w2++;
            }
        }

        return output.toString(); 
    }
}