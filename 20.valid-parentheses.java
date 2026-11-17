/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char x : s.toCharArray()){
            if(!st.empty()){
                if(st.peek() == '(' && x == ')')
                    st.pop();
                else if(st.peek() == '{' && x == '}')
                    st.pop();
                else if(st.peek() == '[' && x == ']')
                    st.pop();
                else
                    st.add(x);
            }
            else
                st.add(x);
        }
        return st.size() == 0;
    }
}
// @lc code=end

