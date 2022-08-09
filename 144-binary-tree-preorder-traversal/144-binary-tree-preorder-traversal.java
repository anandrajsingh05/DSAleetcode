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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        solve(root,list);
        
        return list;
    }
    
    public void solve(TreeNode root, List<Integer> bag){
        if(root==null) return;
        bag.add(root.val);
        solve(root.left,bag);
        solve(root.right,bag);
    }
    
}