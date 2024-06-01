class Solution {
    public int scoreOfString(String s) {
        int output = 0;
        
        for(int i = 0; i < s.length() - 1; i++) {
            int a = s.charAt(i);
            int b = s.charAt(i + 1);

            // System.out.println(a + " " + b);

            output += Math.abs(a - b);
        }

        return output;
    }
}