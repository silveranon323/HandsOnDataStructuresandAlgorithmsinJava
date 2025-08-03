package Graph;
import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u); // for undirected graph
    }

    public void printGraph() {
        for (int node : adjList.keySet()) {
            System.out.print(node + " -> ");
            for (int nbr : adjList.get(node)) {
                System.out.print(nbr + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.printGraph();
    }
}