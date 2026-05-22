// LeetCode 605. Can Place Flowers
class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty = false;
                boolean rightEmpty = false;

                if (i == 0) {
                    leftEmpty = true;
                } else if (flowerbed[i - 1] == 0) {
                    leftEmpty = true;
                }

                if (i == flowerbed.length - 1) {
                    rightEmpty = true;
                } else if (flowerbed[i + 1] == 0) {
                    rightEmpty = true;
                }

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    count++;
                }
            }

            if (count >= n) {
                return true;
            }
        }

        return false;
    }
}
