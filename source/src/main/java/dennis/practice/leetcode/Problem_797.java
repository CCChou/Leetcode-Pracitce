package dennis.practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem_797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, path, paths);
        return paths;
    }
    
    private void dfs(int[][] graph, int node, List<Integer> path, List<List<Integer>> paths) {
        if(node == graph.length - 1) {
            paths.add(new ArrayList<Integer>(path));
            return;
        }
        
        for(int nextNode : graph[node]) {
            path.add(nextNode);
            dfs(graph, nextNode, path, paths);
            path.remove(path.size() - 1);
        }
    }
    
    public static void main(String[] args) {
        Problem_797 test = new Problem_797();
        test.allPathsSourceTarget(new int[][] {{1,2},{3},{3},{}});
    }
}
