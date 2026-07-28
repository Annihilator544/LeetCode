/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 */

// @lc code=start
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int arrLength = nums.length;
        for (int i = 0; i < arrLength; i++) {
            ans[i] = nums[i];
            ans[i+arrLength] = nums[i];
        }
        return ans;
    }
}
// @lc code=end

