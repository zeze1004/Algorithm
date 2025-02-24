class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int total = 0;
        int prev = 0; // 이전 문자 값
        
        // 오른쪽에서 왼쪽으로 처리
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            
            if (curr < prev) {
                total -= curr; // 작은 값이 앞에 있으면 빼줌
            } else {
                total += curr;
            }
            prev = curr; // 현재 값을 이전 값으로 업데이트
        }
        
        return total;
    }
}