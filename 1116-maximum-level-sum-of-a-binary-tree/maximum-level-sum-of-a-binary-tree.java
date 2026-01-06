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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        int max=Integer.MIN_VALUE;
        int maxl=1;
        int currl=1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int lvlsize =q.size(), lvlsum=0; 
            for(int i=0; i<lvlsize; i++){
                TreeNode node = q.poll();
                lvlsum+=node.val;
                if(node.left!=null){
                q.add(node.left);
              }
              if(node.right!=null){
                q.add(node.right);
              }
            }
              
              if(lvlsum>max){
                max= lvlsum;
                maxl= currl;
              }
            currl++;   
        }
        return maxl;
        
    }
}