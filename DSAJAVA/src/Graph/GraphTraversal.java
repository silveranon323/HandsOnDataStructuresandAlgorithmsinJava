package Graph;

import java.util.*;

public class GraphTraversal {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int nbr : adjList.getOrDefault(node, Collections.emptyList())) {
                if (!visited.contains(nbr)) {
                    visited.add(nbr);
                    queue.add(nbr);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");
        for (int nbr : adjList.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(nbr)) {
                dfsHelper(nbr, visited);
            }
        }
    }

    public static void main(String[] args) {
        GraphTraversal graph = new GraphTraversal();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.print("BFS starting from node 1: ");
        graph.bfs(1);

        System.out.print("DFS starting from node 1: ");
        graph.dfs(1);
    }
}
