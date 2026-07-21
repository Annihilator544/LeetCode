
import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] ans = new int[2];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int requiredNumber = target - nums[i];
            if(hashMap.containsKey(requiredNumber)){
                int j = hashMap.get(requiredNumber);
                if(i > j){
                    ans[0] = j;
                    ans[1] = i;
                }
                else{
                    ans[0] = i;
                    ans[1] = j;
                }
                return ans;
            }
            hashMap.put(nums[i], i);
        }
        return ans;
    }
}
// @lc code=end

