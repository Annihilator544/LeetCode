/*
 * @lc app=leetcode id=3364 lang=java
 *
 * [3364] Minimum Positive Sum Subarray 
 */

// @lc code=start

import java.util.List;

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int MinSum = Integer.MAX_VALUE;
        int arrSize = nums.size();
        for (int i = 0; i < arrSize -l + 1; i++) {
            int sum =0;
            int count =0;
            for (int j = 0; j < r; j++) {
                if(count>=l){
                    if(MinSum>sum && sum > 0)
                        MinSum = sum;
                }
                if(i+j<arrSize)
                    sum += nums.get(i + j);
                count ++;
            }
            if(MinSum>sum && sum > 0)
                MinSum = sum;
        }
        return MinSum > 0 && MinSum != Integer.MAX_VALUE ? MinSum : -1;
    }
}
// @lc code=end

