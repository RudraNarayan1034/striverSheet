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
    public int rangeSumBST(TreeNode root, int low, int high) {
        helper(root,low,high);
        return sum;
        
    }
    int sum=0;
    void helper(TreeNode root, int low, int high){
        if(root!=null){
            //with in the Range
            if(root.val>=low&&root.val<=high){
                sum=sum+root.val;
            }
            if(low<root.val){
                helper(root.left,low,high);
            }
            if(root.val<high){
                helper(root.right,low,high);
            }
        }
    }
}