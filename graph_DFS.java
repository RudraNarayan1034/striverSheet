class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean []visited=new boolean[V];
        ArrayList<Integer> result=new ArrayList<>();
        helper(0,visited,result,adj);
        return result;
    }
    void helper(int vertex,boolean[] visited,ArrayList<Integer> result,ArrayList<ArrayList<Integer>> adjList){
        //mark the current vertex as visited
        visited[vertex]=true;
        result.add(vertex);
        //explore the neighbours of current vertex
        for(int i=0;i<adjList.get(vertex).size();i++){
            //check is it already visited or not
            int neighbour= adjList.get(vertex).get(i);
            if(!visited[neighbour]){
                helper(neighbour,visited,result,adjList);
            }
        }
    }
}