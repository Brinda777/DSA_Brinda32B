
public class MinimumCostClothing {
    static int MAX_INT_VALUE = Integer.MAX_VALUE;
    static int ZERO = 0;
    static int ONE = 1;
    static int TWO = 2;

    public static int findMinCost(int N, int[][] price) {
        int minCostPerson1 = MAX_INT_VALUE;
        int minCostPerson2 = MAX_INT_VALUE;
        int minCostPerson3 = MAX_INT_VALUE;

        for (int i = 0; i < N; i++) {
            minCostPerson1 = Math.min(minCostPerson1, price[i][ZERO]);
            minCostPerson2 = Math.min(minCostPerson2, price[i][ONE]);
            minCostPerson3 = Math.min(minCostPerson3, price[i][TWO]);
        }
        int totalMinCost = minCostPerson1 + minCostPerson2 + minCostPerson3;
        return totalMinCost;
    }
    
    public static void main(String[] args) {
        int N = 3;
        int[][] price = { {14, 4, 11}, {11, 14, 3}, {14, 2, 10} };
        int output = findMinCost(N, price);
        System.out.println(output);  
    }
}
