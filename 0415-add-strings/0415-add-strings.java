class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder output = new StringBuilder();
        int carry = 0;
        int len1 = num1.length() - 1, len2 = num2.length() - 1;

        while (len1 >= 0 || len2 >= 0 || carry != 0) {
            int x1 = len1 >= 0 ? num1.charAt(len1) - '0' : 0;
            int x2 = len2 >= 0 ? num2.charAt(len2) - '0' : 0;
            int value = (x1 + x2 + carry) % 10; // 더할 일의자리 수
            carry = (x1 + x2 + carry) / 10; // 승수
            output.append(value);
            len1--; len2--;
        }

        return output.reverse().toString();
    }
}