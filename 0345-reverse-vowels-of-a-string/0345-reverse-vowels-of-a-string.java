class Solution {
    public String reverseVowels(String s) {
        Deque<Character> vowels = new LinkedList<>();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u' || sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O' || sb.charAt(i) == 'U') {
                char c = sb.charAt(i);
                vowels.add(c);
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u' || sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O' || sb.charAt(i) == 'U') {
                sb.setCharAt(i, vowels.pollLast());
            }
        }

        return sb.toString();
    }
}