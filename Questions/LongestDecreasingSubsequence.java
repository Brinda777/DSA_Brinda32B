import java.util.Arrays;

public class LongestDecreasingSubsequence {
    static int ONE = 1;

    public static int longestSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp, ONE);

        // Compute the length of the longest subsequence for each element
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] < nums[j] && Math.abs(nums[i] - nums[j]) <= k) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find the maximum length in the dp array
        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {8, 5, 4, 2, 1, 4, 3, 4, 3, 1, 15};
        int k = 3;
        int output = longestSubsequence(nums, k);
        System.out.println(output);
    }
}
