class Solution{
    public static int findMax(Node root){
        //base case
        if(root==null){
            return Integer.MIN_VALUE;
        }
        //code here
        int leftValue=findMax(root.left);
        int rightValue=findMax(root.right);
        return Math.max(root.data,Math.max(leftValue,rightValue));
    }
    public static int findMin(Node root){
        //code here
        if(root==null){
            return Integer.MAX_VALUE;
        }
        //code here
        int leftValue=findMin(root.left);
        int rightValue=findMin(root.right);
        return Math.min(root.data,Math.min(leftValue,rightValue));
    }
    
}
