class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] output = new int[num_people];

        for (int i = 0; candies > 0; i++) {
            output[i % num_people] += Math.min(candies, i + 1);
            candies -= i + 1;
        }

        // int tmpCandies = candies;
        // int count = 0;
        // int candy = 1;
        // for(int i = 1; i <= candies; i++) {
        //     if (tmpCandies <= 0) break;
        //     output[count % num_people] += i;
        //     System.out.printf("output[%d] = %d\n", count % num_people, output[count % num_people]);
        //     tmpCandies -= i; count++;
        //     candy += i
        // }
        
        return output;
    }
}