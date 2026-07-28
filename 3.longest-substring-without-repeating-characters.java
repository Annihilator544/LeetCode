/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int i = 0;
        for (int k = 0; k < n; k++) {
            for (int j = i; j < k; j++) {
                if (s.charAt(j) == s.charAt(k)) {
                    i = j + 1;
                    break;
                }
            }
            ans = Math.max(ans, k - i + 1);
        }
        return ans;
    }
}
// @lc code=end

