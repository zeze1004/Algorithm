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
        backtracking(output, new StringBuilder(), digits, 0);

        return output;
    }

    private void backtracking(List<String> output, StringBuilder sb, String digits, int index) {
        // 종료 조건
        if (index == digits.length()) {
            output.add(sb.toString());
            return;
        }

        String letters = KEYS[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            // 다음 문자를 추가하기 위해 재귀 호출
            backtracking(output, sb, digits, index + 1);
            // 추가된 문자는 제거
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}