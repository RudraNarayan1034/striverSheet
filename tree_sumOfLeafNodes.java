class GfG
{
    public int SumofLeafNodes(Node root)
    {
        //base case
        if(root==null){
            return 0;
        }
        //leaf node
        if(root.left==null&&root.right==null){
            return root.data;
        }
        // your code here
        int leftSum=SumofLeafNodes(root.left);
        int rightSum=SumofLeafNodes(root.right);
        return leftSum+rightSum;
    }
}
