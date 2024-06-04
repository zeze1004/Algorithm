class Solution {
    public int longestPalindrome(String s) {
        int output = 0, odd = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Character key : map.keySet()) {
            if (map.get(key) % 2 == 1) odd++;
            output += map.get(key);
        }

        // 홀수 글자가 2개 이상 있다면
        if (odd >= 2) {
            output -= odd;
            output++;
        }

        return output;
    }
}