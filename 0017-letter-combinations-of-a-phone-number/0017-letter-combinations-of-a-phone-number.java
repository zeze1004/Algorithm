class Solution {
    // 숫자에 대응하는 문자 맵핑
    String[] KEYS = {
        "",    
        "",    
        "abc", 
        "def", 
        "ghi", 
        "jkl", 
        "mno", 
        "pqrs",
        "tuv", 
        "wxyz" 
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        if (digits.length() == 0) return output;
    
        backtracking(digits, output, 0, new StringBuilder());

        return output;
    }

    private void backtracking(String digits, List<String> output, int index, StringBuilder sb) {
        if (index >= digits.length()) {
            output.add(new StringBuilder(sb).toString());
            return;
        }
 
        String nums = KEYS[digits.charAt(index) - '0'];
        for (int i = 0; i < nums.length(); i++) {
            sb.append(nums.charAt(i));
            backtracking(digits, output, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}