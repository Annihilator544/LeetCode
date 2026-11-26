/*
 * @lc app=leetcode id=3360 lang=java
 *
 * [3360] Stone Removal Game
 */

// @lc code=start
class Solution {
    public boolean canAliceWin(int n) {
        int i =10;
        boolean IsAliceTurn = true;
        while(i > 0){
            if(n<i)
                return IsAliceTurn ? false : true;
            n-=i;
            i--;
            IsAliceTurn = !IsAliceTurn;
        }
        return IsAliceTurn ? false : true;
    }
}
// @lc code=end

