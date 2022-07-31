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
    
    TreeNode first = null;
    TreeNode second = null;
    
    TreeNode prev = new TreeNode(Integer.MIN_VALUE); // because check the constraint node.val can be -2^31
    
    public void recoverTree(TreeNode root) {
        
       inorder(root);
        int temp =first.val;
        first.val = second.val;
        second.val = temp;
    }
    
    public void inorder(TreeNode root)
    {
        if(root == null) 
            return;
        
        inorder(root.left); // left traversal
        
        if(first == null && prev.val>root.val) //first time first will be null
            first=prev;  
        
        if(first!=null && prev.val>root.val) // second time first will not equal to null
            second = root;
            //print
        
        prev = root;  //need to update everytime
        inorder(root.right); //right traversal
    }
}
//tc = o(n)
//sc = o(logn)