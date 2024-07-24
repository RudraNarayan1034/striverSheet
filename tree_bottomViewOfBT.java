//User function Template for Java
class Pair{
    Node node;
    int hd;
    Pair(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
}

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> result=new ArrayList<>();
        Map<Integer,Node> map=new TreeMap<>();
        if(root==null){
            return result;
        }
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair pair=queue.poll();
            map.put(pair.hd,pair.node);
            //bottom view maintain here
            
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