class Solution {
    public int maxVowels(String s, int k) {
        int vowel = 0;

        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            }
        }
        if (vowel == k) return k;

        int maxVowel = vowel;
        
        for (int i = k; i < s.length(); i++) {
            char c = s.charAt(i);
            char pastC = s.charAt(i - k);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            }
            if (pastC == 'a' || pastC == 'e' || pastC == 'i' || pastC == 'o' || pastC == 'u') {
                vowel--;
            }
            maxVowel = Math.max(maxVowel, vowel);
            if (maxVowel == k) return k;
        }

        return maxVowel;
    }
}