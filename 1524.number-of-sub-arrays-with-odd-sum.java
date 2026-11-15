/*
 * @lc app=leetcode id=1524 lang=java
 *
 * [1524] Number of Sub-arrays With Odd Sum
 */

// @lc code=start
class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007;
        long oddEnd = 0, evenEnd = 0, ans = 0;

        for (int x : arr) {
            if ((x & 1) == 1) {
                long newOdd = evenEnd + 1;
                long newEven = oddEnd;
                oddEnd = newOdd;
                evenEnd = newEven;
            } else {
                evenEnd++;
            }
            ans = (ans + oddEnd) % MOD;
        }
        return (int) ans;
    }
}
// @lc code=end

