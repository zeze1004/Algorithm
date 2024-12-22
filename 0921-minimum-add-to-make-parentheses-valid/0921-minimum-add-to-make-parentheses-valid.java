class Solution {
    public int minAddToMakeValid(String s) {
        int needOpenCount = 0, needCloseCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                needOpenCount++;
            }
            else {
                if (needOpenCount > 0) {
                    needOpenCount--;
                } else {
                    needCloseCount++;
                }
            }
        }

        return needOpenCount + needCloseCount;
    }
}