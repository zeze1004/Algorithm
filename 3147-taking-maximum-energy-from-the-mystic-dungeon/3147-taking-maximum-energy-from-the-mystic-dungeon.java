class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int[] dp = new int[energy.length];  
        int output = Integer.MIN_VALUE;
        for (int i = k; i < energy.length; i++) {
            energy[i]= Math.max(energy[i], (energy[i]+energy[i-k]));
        }

        for (Integer i : energy) System.out.println(i);
        
        for (int i = 0; i < k; i++) output = Math.max(output, energy[energy.length-i-1]);
        return output;
    }

    /**
    // 2번 시간초과 코드
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int max = energy.length - k;
        int output = Integer.MIN_VALUE;
        int[] dp = new int[energy.length];        
        // 시작점
        for (int i = 0; i < max; i++) {
            dp[i] = energy[i];
            for (int j = i + k; j < energy.length; j+=k) {
                dp[i] += energy[j];
            }
            output = Math.max(dp[i], output);
        }
        for (int i = max; i < energy.length; i++) {
            output = Math.max(energy[i], output);
        }
        
        return output;
    }
}
 */
}