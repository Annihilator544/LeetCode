/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        int high =1,low=0;
        while(high != prices.length){
            int profit = prices[high] - prices[low];
            int profit2 = prices[high] - minPrice;
            if(profit > maxProfit || profit2 > maxProfit){
                maxProfit = profit>profit2 ? profit : profit2;
                high++;
            }
            else if(prices[high] < minPrice){
                minPrice = prices[high];
                low = high;
                high++;
            }
            else{
                high++;
            }
        }
        return maxProfit;
    }
}
// @lc code=end

