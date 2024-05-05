class L345 {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = s.length() - 1; i >= 0; i--) {
            for (char v : vowels) {
                if (v == s.charAt(i)) sb.append(s.charAt(i));
            }
        }

        int idx = 0;

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            for (char v : vowels) {
                if (v == s.charAt(i)) {
                    ans.append(sb.charAt(idx));
                    idx++;
                    flag = false;
                }
            }
            if (flag) ans.append(s.charAt(i));
        }

        return ans.toString();
    }
}
