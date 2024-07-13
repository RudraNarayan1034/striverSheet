class Solution {

    public static int countNodes(Node root) {
        //base case
        if(root==null){
            return 0;
        }
        // Code here
        int count=1;
        count=count+countNodes(root.left);
        count=count+countNodes(root.right);
        return count;
        
    }
}