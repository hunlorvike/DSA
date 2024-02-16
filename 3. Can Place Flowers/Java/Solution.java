class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;

        int possible = 0;
        int length = flowerbed.length;

        if (length == 1) {
            return flowerbed[0] == 0;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            possible++;
            flowerbed[0] = 1;
        }

        for (int i = 1; i < length - 1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1) {
                possible++;
                flowerbed[i] = 1;
            }
        }

        if (flowerbed[length - 1] == 0 && flowerbed[length - 2] == 0) {
            possible++;
        }

        return possible >= n;
    }
}