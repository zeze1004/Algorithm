class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int output = 0;
        if (flowerbed.length == 1) {
            if (n > 1) {
                 return false;
            } else if (n == 1) {
                if (flowerbed[0] == 1) return false;
                else return true;
            }
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            output++;
            flowerbed[0] = 1;
        }
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            output++;
            flowerbed[flowerbed.length - 1] = 1;
        }

        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] == 0) {
                output++;
                flowerbed[i] = 1;
            }
        }

        return output >= n;
    }
}