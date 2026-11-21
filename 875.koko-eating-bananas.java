/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minAnswer = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if(piles.length == 1)
            return (int) Math.ceil((double) piles[0] / h);
        for( int x : piles){
            if(x > max)
                max = x;
            if(x < min)
                min = x;
        }
        int low = 1, high = max; 
        while(high >= low){
            int mid = low + (high - low) / 2;
            int totalHours = 0;
            for( int x : piles){
                totalHours += Math.ceil((double) x / mid);
                if(totalHours > h)
                    break;
            }
            if(totalHours > h){
                low = mid + 1;
            }
            else if(totalHours <= h){
                high = mid -1;
                if(minAnswer > mid){
                    minAnswer = mid;
                }
            }
        }
        return minAnswer;
    }
}
// @lc code=end

