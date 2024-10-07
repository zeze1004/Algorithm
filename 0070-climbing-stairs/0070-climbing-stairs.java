class Solution {
    public int climbStairs(int n) {
        List<Integer> stairs = new ArrayList<>();
        stairs.add(1);
        stairs.add(2);
        
        for (int i = 2; i < 45; i++) {
            int tmp = stairs.get(i - 2) + stairs.get(i - 1);
            stairs.add(tmp);
        }

        int output = (stairs.get(n - 1)).intValue();

        return output;
    }
}