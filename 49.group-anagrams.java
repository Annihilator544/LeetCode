
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] count = new char[26];
            for (char c : s.toCharArray()) count[c - 'a']++;
            map.computeIfAbsent(new String(count), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
// @lc code=end

