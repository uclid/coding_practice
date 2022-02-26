/*
Q: Given the root of a binary tree and an integer targetSum, return true if the tree has a 
root-to-leaf path such that adding up all the values along the path equals targetSum.
*/

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
class PathSum {
    
    public boolean sumPath(TreeNode root, int targetSum){
        if(root == null){
            if(targetSum == 0){
                return true;
            }else{
                return false;
            }
        }

        if(root.left != null && root.right != null){
            return sumPath(root.left,targetSum-root.val) || sumPath(root.right,targetSum-root.val);    
        }else if(root.right == null){
            return sumPath(root.left,targetSum-root.val);
        }else{
            return sumPath(root.right,targetSum-root.val);
        }
           
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null){
            return false;
        }
        
        return sumPath(root,targetSum);
        
    }
}
