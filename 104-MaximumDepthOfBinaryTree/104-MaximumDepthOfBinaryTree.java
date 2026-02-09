// Last updated: 2/9/2026, 11:55:49 AM
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
        int lc=0,rc=0;
        if(root==null)return 0;
        lc=1+maxDepth(root.left);
        rc=1+maxDepth(root.right);
        if(lc==1) return rc;
        if(rc==1) return lc;
        return Math.max(lc,rc);
    }
}