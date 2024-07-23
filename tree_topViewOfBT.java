/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair{
    Node node;
    int hd;
    Pair(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
}

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> result=new ArrayList<>();
        Map<Integer,Node> map=new TreeMap<>();
        if(root==null){
            return result;
        }
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair pair=queue.poll();
            //top view maintain here
            if(!map.containsKey(pair.hd)){
                map.put(pair.hd,pair.node);
            }
            if(pair.node.left!=null){
                queue.offer(new Pair(pair.node.left,pair.hd-1));
            }
            if(pair.node.right!=null){
                queue.offer(new Pair(pair.node.right,pair.hd+1));
            }
            
            
        }
        //list fill Hd Negative to Positive
        for(Map.Entry<Integer,Node> m:map.entrySet()){
            result.add(m.getValue().data);
        }
        return result;
        
    }
}