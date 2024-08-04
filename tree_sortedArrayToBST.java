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
    int nums[];
    TreeNode helper(int left,int right){
        //base case
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        //create a node
        TreeNode node=new TreeNode(nums[mid]);
        node.left=helper(left,mid-1);
        node.right=helper(mid+1,right);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
       this.nums=nums;
       return helper(0,nums.length-1);

    }
}