/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        int[] maxDepth = {0};
        recurse(root, 1, maxDepth);
        return maxDepth[0];
    }
    public void recurse(TreeNode node, int level, int[] maxDepth){
        if(node == null) return;
        if(level >= maxDepth[0])
            maxDepth[0] = level;
        recurse(node.left, level + 1, maxDepth);
        recurse(node.right, level + 1, maxDepth);
    }
}
// @lc code=end

