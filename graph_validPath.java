class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList =new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int edge []: edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        Stack<Integer> stack=new Stack<>();
        stack.push(source);
        boolean visited []=new boolean [n];//fill with false
        while(!stack.isEmpty()){
            int node=stack.pop();
            if(node==destination){
                return true;
            }
            if(visited[node]){
                continue;
            }
            visited[node]=true;
            //explore the neighbour
            for(int neighbour:adjList.get(node)){
                stack.push(neighbour);
            }
        }
        return false;
    }
}