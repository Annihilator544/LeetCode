/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()){
            return false;
        }
        HashMap <Character,Integer> map = new HashMap<>();
        for(char x: s.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(char x: t.toCharArray()){
             if(!map.containsKey(x)){
                return false;
            }
            map.put(x, map.get(x)-1);
            if(map.get(x) == 0){
                map.remove(x);
            }
        }
        for( int x: map.values()){
            if(x != 0){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

