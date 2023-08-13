// Link: https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75

// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

// -------------------------------------------------------------
// Approach-1 Linear Scan
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

// -------------------------------------------------------------

