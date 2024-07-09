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
class pair{
    TreeNode node;
    int depth;
    pair(TreeNode node,int depth){
        this.node=node;
        this.depth=depth;
    }
 }
class Solution {
    /*//recursive approach
    public int maxDepth(TreeNode root) {
        //base case
        if(root==null){
            return 0;
        }
        int left =maxDepth(root.left);//move to left
        int right=maxDepth(root.right);//move to right
        int max=Math.max(left,right);
        return max+1;
    }*/
    //iterative  Approach
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        Stack<pair>stack=new Stack<>();
        stack.push(new pair(root,1));
        int maximumDepth=0;
        while(!stack.isEmpty()){
            pair pair=stack.pop();
            TreeNode node=pair.node;
            int depth=pair.depth;
            maximumDepth=Math.max(maximumDepth,depth);
            if(node.left!=null){
                stack.push(new pair(node.left,depth+1));
            }
            if(node.right!=null){
                stack.push(new pair(node.right,depth+1));
            }
        }
        return maximumDepth;

    }
}