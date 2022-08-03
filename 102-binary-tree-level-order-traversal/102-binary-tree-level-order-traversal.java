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
    /* Iterative solution
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        
        Queue<TreeNode> q = new LinkedList<>(); 
        q.offer(root); // add root to queue
        
        while(!q.isEmpty())  //traverse till queue becomes empty
        {
            int size = q.size();
            List<Integer> currLevel = new ArrayList<>();
            while(size-->0)
            {
                TreeNode curr = q.poll();
                currLevel.add(curr.val);
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                
            }
            list.add(currLevel);
        }
        return list;
    }
    */
    List<List<Integer>> result;
   
     public List<List<Integer>> levelOrder(TreeNode root) {
         
             result = new ArrayList<>();
             if(root==null)
                 return result;
             traverse(root,0);
             return result;
             
         }
        public void traverse(TreeNode root,int level)
         {
            if(root==null) return;
             if(result.size()==level)
                 result.add(new ArrayList<>());
         
         
         result.get(level).add(root.val);
         traverse(root.left,level+1);
         traverse(root.right,level+1);
        }
}