class Solution {
    public int heightChecker(int[] heights) {
        int[] copyArray = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int output = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copyArray[i]) output++; 
        }
        

        return output;
    }
}