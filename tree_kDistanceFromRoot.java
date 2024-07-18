//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
          ArrayList<Integer> result=new ArrayList<Integer>();
          Queue<Node> queue=new LinkedList<>();
          queue.offer(root);
          int level=0;
          while(!queue.isEmpty()){
              int size=queue.size();
              if(level==k){
                  for(int i=0;i<size;i++){
                      result.add(queue.poll().data);
                  }
                  return result;
              }
              for(int i=0;i<size;i++){
                  Node node=queue.poll();
                  if(node.left!=null){
                      queue.offer(node.left);
                  }
                  if(node.right!=null){
                      queue.offer(node.right);
                  }
              }
              level++;
          }
          return result;
     }
}
