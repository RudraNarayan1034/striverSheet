//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> result=new ArrayList<Integer>();
      if(root==null){
          return result;
      }
      Queue<Node> queue =new LinkedList<>();
      queue.offer(root);
      while(!queue.isEmpty()){
          int size=queue.size();
          for(int i=0;i<size;i++){
              Node node=queue.poll();
              if(i==0){
                  result.add(node.data);
              }
              if(node.left!=null){
                  queue.offer(node.left);
              }
              if(node.right!=null){
                  queue.offer(node.right);
              }
          }
      }
      return result; 
    }
}
