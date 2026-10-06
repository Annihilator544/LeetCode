
import java.util.Stack;

/*
 * @lc app=leetcode id=921 lang=java
 *
 * [921] Minimum Add to Make Parentheses Valid
 */

// @lc code=start
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char elem : s.toCharArray()) {
            if(elem == '('){
               stack.push(elem); 
            }
            if(elem == ')'){
                if(!stack.empty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.push(elem);
                }
            }
        }
        return stack.size();
    }
}
// @lc code=end

