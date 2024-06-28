class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] output = new int[num_people];

        int candy = 1;
        int idx = 0;

        while (true) {
            System.out.printf("idx: %d\n", idx);

            if (candy >= candies) {
                output[idx % num_people] += candies;
                break;
            }

            output[idx % num_people] += candy;
            candies -= candy;
            idx++; candy++;
        }
        
        return output;
    }
}