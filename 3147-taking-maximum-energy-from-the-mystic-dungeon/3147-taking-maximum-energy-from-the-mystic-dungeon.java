class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int output = -1001;

        for (int i = k; i < energy.length; i++) {
            energy[i] = Math.max(energy[i], (energy[i] + energy[i - k]));
        }

        for (int i = k; i < energy.length; i++) {
            output = Math.max(output, energy[i]);
        }

        return output;
    }
    /**
    int[] dp = new int[energy.length];  
        int output = Integer.MIN_VALUE;
        for (int i = k; i < energy.length; i++) {
            energy[i]= Math.max(energy[i], (energy[i]+energy[i-k]));
        }

        for (Integer i : energy) System.out.println(i);
        
        for (int i = 0; i < k; i++) output = Math.max(output, energy[energy.length-i-1]);
        return output;
     */
}