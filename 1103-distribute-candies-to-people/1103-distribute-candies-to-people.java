class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] output = new int[num_people];

        int candy = 1;
        int idx = 0;

        while (candy <= candies) {
            System.out.printf("idx: %d\n", idx);

            output[idx % num_people] += candy;
            candies -= candy;
            idx++; candy++;
        }

        if (output[num_people - 1] == 0) {
            output[num_people - 1] = candies;
        }


        
        return output;
    }
}