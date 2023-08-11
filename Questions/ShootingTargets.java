public class ShootingTargets {

    public static int maxPoints(int[] a) {
        int n = a.length;

        // Pad the array with 1 at the beginning and end
        int[] targets = new int[n + 2];
        targets[0] = targets[n + 1] = 1;
        System.arraycopy(a, 0, targets, 1, n);

        int[][] dp = new int[n + 2][n + 2];

        for (int len = 1; len <= n; len++) {
            for (int left = 1; left + len - 1 <= n; left++) {
                int right = left + len - 1;
                for (int i = left; i <= right; i++) {
                    dp[left][right] = Math.max(dp[left][right], dp[left][i - 1] + 
                    targets[left - 1] * targets[i] * targets[right + 1] + 
                    dp[i + 1][right]);
                }
            }
        }

        return dp[1][n];
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 5, 8};
        int result = maxPoints(a);
        System.out.println("Maximum points: " + result);
    }
}
