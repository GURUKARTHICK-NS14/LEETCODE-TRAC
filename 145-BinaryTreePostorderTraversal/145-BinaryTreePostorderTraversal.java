// Last updated: 2/9/2026, 11:55:40 AM
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
    ArrayList<Integer> ans=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            ans.add(root.val);
        }
        return ans;
    }
}