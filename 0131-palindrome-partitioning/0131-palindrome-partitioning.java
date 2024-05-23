class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> output = new ArrayList<>();
        
        backtrack(s, output, new ArrayList<>(), 0);
        return output;
    }

    public void backtrack(String s, List<List<String>> output, List<String> sub, int idx) {
        if (idx == s.length()) {
            output.add(new ArrayList<>(sub));
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            String tmp = s.substring(idx, i + 1);
            if (isPalindrom(tmp)) {
                sub.add(tmp);
                backtrack(s, output, sub, i + 1);
                sub.remove(sub.size() - 1); // 이전 과정으로 돌아가기 위해. 제거하지 않으면 중복값이 생김.
            }
        }
    }

    public boolean isPalindrom(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}