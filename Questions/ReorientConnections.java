import java.util.ArrayList;
import java.util.List;

public class ReorientConnections {

    public static int minReorientations(int n, int[][] connections) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] connection : connections) {
            int from = connection[0];
            int to = connection[1];
            graph[from].add(to);
        }

        int[] visited = new int[n];
        int[] result = new int[1];
        dfs(0, graph, visited, result);

        return result[0];
    }

    private static void dfs(int node, List<Integer>[] graph, int[] visited, int[] result) {
        visited[node] = 1;

        for (int neighbor : graph[node]) {
            if (visited[neighbor] == 0) {
                dfs(neighbor, graph, visited, result);
            } else if (visited[neighbor] == 1) {
                result[0]++;
            }
        }

        visited[node] = 2;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        int output = minReorientations(n, connections);
        System.out.println(output); 
    }
}
