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
            if(mid+1 < nums.length && nums[mid] >= nums[mid+1])
                return nums[mid+1];
            else if(mid-1 >=0 &&nums[mid] <= nums[mid-1])
                return nums[mid];
            else if(nums[mid] < nums[high])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return nums[0];
    }
}
// @lc code=end

