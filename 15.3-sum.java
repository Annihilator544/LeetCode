
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Map<String, List<Integer>> ansMap = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int sum = -nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int complement = sum - nums[j];
                if (map.containsKey(complement) && map.get(complement) > j) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(complement);
                    Collections.sort(triplet);
                    String key = triplet.get(0) + "," + triplet.get(1) + "," + triplet.get(2);
                    if (!ansMap.containsKey(key)) {
                        ansMap.put(key, triplet);
                        ans.add(triplet);
                    }
                }
            }
        }
        return ans;
    }
}
// @lc code=end

