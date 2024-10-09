class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // str1 길이가 더 길게 유지
        if (str2.length() > str1.length()) {
            return gcdOfStrings(str2, str1);
        }

        if (str2.equals(str1)) return str1;

        // str2로 str1이 나눠질 수 있다면
        if (str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2); // str1에서 str2과 동일한 앞부분을 지우고 다시 검사 
        }

        return "";
    }
}