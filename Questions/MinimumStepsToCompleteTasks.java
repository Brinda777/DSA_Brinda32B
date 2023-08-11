import java.util.*;

public class MinimumStepsToCompleteTasks {

    public int minimumSteps(int N, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] prereq : prerequisites) {
            int x = prereq[0];
            int y = prereq[1];
            graph[y].add(x);
        }

        int[] memo = new int[N + 1];

        int minSteps = 0;
        for (int i = 1; i <= N; i++) {
            if (memo[i] == 0) {
                minSteps = Math.max(minSteps, dfs(i, graph, memo));
            }
        }
        return minSteps;
    }

    private int dfs(int task, List<Integer>[] graph, int[] memo) {
        if (memo[task] > 0) {
            return memo[task];
        }

        int maxSteps = 0;
        for (int prereq : graph[task]) {
            maxSteps = Math.max(maxSteps, dfs(prereq, graph, memo));
        }

        memo[task] = maxSteps + 1;
        return memo[task];
    }

    public static void main(String[] args) {
        int N = 3;
        int[][] prerequisites = { { 1, 3 }, { 2, 3 } };
        MinimumStepsToCompleteTasks solver = new MinimumStepsToCompleteTasks();
        int result = solver.minimumSteps(N, prerequisites);
        System.out.println("Minimum number of steps: " + result);
    }
}
