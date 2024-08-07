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
class Pair{
    TreeNode node;
    int currentSum;
    Pair(TreeNode node,int currentSum){
        this.node=node;
        this.currentSum=currentSum;
    }
 }
class Solution {
    //Iterative solution
    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root==null){
            return false;
        }
        Stack<Pair>stack=new Stack<>();
        stack.push(new Pair(root,0));
        while(!stack.isEmpty()){
            Pair pair=stack.pop();
            TreeNode node=pair.node;
            int currentSum=pair.currentSum;
            currentSum=currentSum+node.val;
            //reach to leaf node
            if(node.left==null&&node.right==null){
                if(currentSum==targetSum){
                    return true;
                }
            }
            if(node.left!=null){
                stack.push(new Pair(node.left,currentSum));
            }
            if(node.right!=null){
                stack.push(new Pair(node.right,currentSum));
            }
        }
        return false;
    }
    /*//recursive Approach
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,0,targetSum);
    }
    boolean helper(TreeNode root,int sum,int targetSum){
        //base case
        //end tree
        if(root==null){
            return false;
        }
        sum=sum+root.val;
        //leaf node
        if(root.left==null&&root.right==null){
            return sum==targetSum;
        }
        //move to left
        boolean leftResult=helper(root.left,sum,targetSum);
        //move to right
        boolean rightResult=helper(root.right,sum,targetSum);
        return leftResult ||rightResult;
    }*/
}