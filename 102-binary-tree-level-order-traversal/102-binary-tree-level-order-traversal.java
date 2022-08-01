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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list= new LinkedList<>();
        
        if(root==null) return list;
        
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            List<Integer> res= new LinkedList<>();
            int len= queue.size();
            
            for(int i=0; i<len; i++){
                
                TreeNode temp= queue.remove();
            
                res.add(temp.val);

                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
                
            }
            
            list.add(res);
        }
        
        return list;
    }
}