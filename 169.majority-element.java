
import java.util.HashMap;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int x : nums) {
            if(frequency.containsKey(x)){
                int prevValue = frequency.get(x);
                frequency.put(x, ++prevValue);
            }
            else{
                frequency.put(x,1);
            }
        }
        int maxFreq = 0;
        int maxFreqValue = nums[0];
        for(int x : frequency.keySet()){
            int val = frequency.get(x);
            if(val > maxFreq){
                maxFreq = val;
                maxFreqValue = x;
            }
        }
        return maxFreqValue;
    }
}
// @lc code=end

