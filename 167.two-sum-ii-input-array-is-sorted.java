/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int slowPointer = 0;
        int fastPointer = numbers.length - 1;
        int [] ans = new int[2];
        while(fastPointer > slowPointer){
            int num1 = numbers[slowPointer];
            int num2 = numbers[fastPointer];
            if(num1 + num2 < target)
                slowPointer++;
            else if(num1 + num2 > target)
                fastPointer--;
            else{
                ans[0] = slowPointer + 1;
                ans[1] = fastPointer + 1;
                break;
            }
        }
        return ans;
    }
}
// @lc code=end

