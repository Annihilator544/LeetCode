/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int high = nums.length-1;
        int low = 0;
        while (high >= low){
            int mid = low + (high - low) / 2;
            if(nums[mid] >= nums[mid+1])
                return nums[mid+1];
            else if(nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
// @lc code=end

