class Solution {
    public int countTriplets(int[] arr) {
        int len = arr.length;
        int output = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int a = 0;
                for (int k = i; k < j; k++) { // 0 ~ (1,2,3,...,len - 1) / 1 ~ (2,3,4,...,len - 1)...
                    a ^= arr[k];
                }

                int b = 0;
                for (int k = j; k < len; k++) { // 1 ~ (2,3,4,...,len - 1) / 2 ~ (3,4,5,...,len - 1)...
                    b ^= arr[k];
                    if(a == b) output++;
                }
            }
        }
        

        return output;
    }
}