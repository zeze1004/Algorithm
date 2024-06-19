class Solution {
    public int clumsy(int n) {
        int sign = 1, output = 0;

        for (int i = n; i > 0; i -= 4) {
            int tmp = i;
            if (i - 1 > 0) tmp *= i - 1;
            if (i - 2 > 0) tmp /= i - 2;
            output += sign * tmp;

            if (i - 3 > 0) output += i - 3;
            sign = -1;
        }
        
        return output;
    }
}