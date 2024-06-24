class Solution {
    public String reverseVowels(String s) {
        Deque<Character> vowels = new LinkedList<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||s.charAt(i) == 'A' || s.charAt(i) == 'e' ||
                s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
                s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                    vowels.push(s.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||s.charAt(i) == 'A' || s.charAt(i) == 'e' ||
                s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
                s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                    output.append(vowels.pop());
            } else {
                output.append(s.charAt(i));
            } 
        } 

        return output.toString();
    }
}