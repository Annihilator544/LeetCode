/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int containsZero = 0;
        for (int elem : nums) {
            if(elem == 0){
                containsZero++;
            }
            else {
                mul *= elem;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(containsZero > 0){
                if(nums[i] == 0 && containsZero == 1){
                    nums[i] = mul;
                }
                else{
                    nums[i] = 0;
                }
            }
            else{
                nums[i] = mul/nums[i];
            }
        }
        return nums;
    }
}
// @lc code=end

