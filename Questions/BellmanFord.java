import java.util.Arrays;

public class BellmanFord {

    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static int[] bellmanFord(int[][] graph, int source) {
        int V = graph.length;
        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        for (int i = 0; i < V - 1; i++) {
            for (Edge edge : getEdges(graph)) {
                int u = edge.source;
                int v = edge.destination;
                int weight = edge.weight;
                if (distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]) {
                    distance[v] = distance[u] + weight;
                }
            }
        }

        // Check for negative cycles
        for (Edge edge : getEdges(graph)) {
            int u = edge.source;
            int v = edge.destination;
            int weight = edge.weight;
            if (distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]) {
                throw new RuntimeException("Graph contains negative cycle.");
            }
        }

        return distance;
    }

    private static Edge[] getEdges(int[][] graph) {
        int V = graph.length;
        int edgeCount = 0;
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (graph[i][j] != 0) {
                    edgeCount++;
                }
            }
        }

        Edge[] edges = new Edge[edgeCount];
        int idx = 0;
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (graph[i][j] != 0) {
                    edges[idx++] = new Edge(i, j, graph[i][j]);
                }
            }
        }
        return edges;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 6, 0, 0, 0, 0, 0, 0, 0},
            {6, 0, 5, -4, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, -1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 8, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, -2, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 9, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 2},
            {0, 0, 0, 0, 0, 0, 0, 0, 4},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        int[] distance = bellmanFord(graph, 0);
        System.out.println(Arrays.toString(distance));
    }
}
