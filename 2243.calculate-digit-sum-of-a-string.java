/*
 * @lc app=leetcode id=2243 lang=java
 *
 * [2243] Calculate Digit Sum of a String
 */

// @lc code=start
class Solution {
    public String digitSum(String s, int k) {
        if(s.length() <= k)
            return s;
        String sb = new String();
        for (int i = 0; i < s.length(); i += k) {
            int sum = 0;
            for (int j = i; j < i + k && j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }
            sb += sum;
        }
        if(sb.length() > k)
            return digitSum(sb,k);
        else
            return sb;
    }
}
// @lc code=end

