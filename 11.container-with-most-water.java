/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int i =0;
        int j =height.length - 1;
        while(j>i && i < height.length && j >=0 ){
            int minHeight = Math.min(height[i], height[j]);
            int waterCapacity = (j - i) * minHeight;
            if(waterCapacity > maxWater)
                maxWater = waterCapacity;
            if(minHeight == height[i])
                i++;
            if(minHeight == height[j])
                j--;
        }
        return maxWater;
    }
}
// @lc code=end

