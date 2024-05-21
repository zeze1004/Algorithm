class Solution {
    public String maximumOddBinaryNumber(String s) {
        int oneNum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') oneNum++;
        }

        if (oneNum == 1) {
            for (int i = 0; i < s.length() - 1; i++)
                sb.append('0');
            sb.append('1');
            return sb.toString();
        }

        for (int i = 0; i < s.length() - 1; i++) {
            oneNum--;
            if (oneNum <= 0) {
                sb.append('0');
            }
            else {
                sb.append('1');
            }
        }
        sb.append('1');
        return sb.toString();
    }
}