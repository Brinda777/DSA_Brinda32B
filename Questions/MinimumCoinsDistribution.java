import java.util.Arrays;

public class MinimumCoinsDistribution {
    static int ONE = 1;
    public static int minCoins(int[] ratings) {
        int n = ratings.length;
        int[] coins = new int[n];
        int totalCoins = 0;

        // Initialize coins array with all 1s
        Arrays.fill(coins, ONE);

        // Traverse from left to right and update coins based on increasing ratings
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                coins[i] = coins[i - 1] + 1;
            }
        }

        // Traverse from right to left and update coins based on decreasing ratings
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && coins[i] <= coins[i + 1]) {
                coins[i] = coins[i + 1] + 1;
            }
        }

        // Calculate total number of coins required
        for (int i = 0; i < n; i++) {
            totalCoins += coins[i];
        }

        return totalCoins;
    }

    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        int output = minCoins(ratings);
        System.out.println(output);
    }
}
