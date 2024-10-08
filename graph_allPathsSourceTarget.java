class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> allPaths=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        helper(0, graph, path, allPaths);
        return allPaths;
        
    }
    void helper(int vertex, int[][]graph,List<Integer>path,List<List<Integer>>allPaths ){
        path.add(vertex);
        //Base case
        if(vertex== graph.length-1){
            allPaths.add(new ArrayList<>(path));
            return;
        }
       
        int neighbours []=graph[vertex];
        for(int neighbour : neighbours){
            helper(neighbour,graph,path,allPaths);
            //Backtracking
            path.remove(path.size()-1);

        }
    }
}