/*
 * @lc app=leetcode id=2914 lang=java
 *
 * [2914] Minimum Number of Changes to Make Binary String Beautiful
 */

// @lc code=start
class Solution {
    public int minChanges(String s) {
        int Changes =0;
        for (int i = 0; i < s.length()-1; i+=2) {
            if (s.charAt(i) != s.charAt(i+1)) {
                Changes++;
            }
        }
        return Changes;
    }
}
// @lc code=end

