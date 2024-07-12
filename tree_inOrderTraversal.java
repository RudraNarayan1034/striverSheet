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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        TreeNode temp=root;
        while(temp!=null||!stack.isEmpty()){
            while(temp!=null){
            stack.push(temp);
            temp=temp.left;
            }
            temp=stack.pop();
            result.add(temp.val);
            temp=temp.right;//move to the right of current node
        }
        return result ;
        
    }
}