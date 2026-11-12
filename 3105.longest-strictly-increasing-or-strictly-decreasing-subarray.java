/*
 * @lc app=leetcode id=3105 lang=java
 *
 * [3105] Longest Strictly Increasing or Strictly Decreasing Subarray
 */

// @lc code=start
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxSICount = 1;
        int maxSDCount = 1;
        int count1 = 1;
        int count2 = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i+1]-nums[i] > 0){
                count1++;
                if(count2 > maxSDCount)
                    maxSDCount=count2;
                count2=1;
            }
            else if(nums[i+1]-nums[i] < 0){
                count2++;
                if(count1 > maxSICount)
                    maxSICount=count1;
                count1=1;
            }
            else{
                if(count2 > maxSDCount)
                    maxSDCount=count2;
                if(count1 > maxSICount)
                    maxSICount=count1;
                count2=1;
                count1=1;
            }
            if(count2 > maxSDCount)
                maxSDCount=count2;
            if(count1 > maxSICount)
                maxSICount=count1;
        }
        return maxSICount > maxSDCount ? maxSICount : maxSDCount;
    }
}
// @lc code=end

