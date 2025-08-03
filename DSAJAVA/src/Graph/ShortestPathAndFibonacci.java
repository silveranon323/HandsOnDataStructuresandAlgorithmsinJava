package Graph;


import java.util.*;

public class ShortestPathAndFibonacci {

    static class Edge {
        int to, weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    private Map<Integer, List<Edge>> adjList = new HashMap<>();

    public void addEdge(int u, int v, int w) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.get(u).add(new Edge(v, w));
    }

    public Map<Integer, Integer> dijkstra(int start) {
        Map<Integer, Integer> dist = new HashMap<>();
        for (int node : adjList.keySet()) {
            dist.put(node, Integer.MAX_VALUE);
        }
        dist.put(start, 0);

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0], nodeDist = curr[1];
            if (nodeDist > dist.get(node)) continue;

            for (Edge edge : adjList.getOrDefault(node, Collections.emptyList())) {
                int newDist = nodeDist + edge.weight;
                if (newDist < dist.getOrDefault(edge.to, Integer.MAX_VALUE)) {
                    dist.put(edge.to, newDist);
                    pq.add(new int[]{edge.to, newDist});
                }
            }
        }
        return dist;
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        ShortestPathAndFibonacci graph = new ShortestPathAndFibonacci();

        graph.addEdge(1, 2, 4);
        graph.addEdge(1, 3, 1);
        graph.addEdge(3, 2, 2);
        graph.addEdge(2, 4, 1);
        graph.addEdge(3, 4, 5);

        Map<Integer, Integer> distances = graph.dijkstra(1);
        System.out.println("Shortest distances from node 1:");
        distances.forEach((node, dist) -> System.out.println("Node " + node + ": " + dist));

        System.out.println("\nFibonacci sequence:");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
