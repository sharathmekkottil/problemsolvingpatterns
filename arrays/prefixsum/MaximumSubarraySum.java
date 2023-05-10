import java.util.Arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] prefixSum = new int[arr.length];

        // Compute Prefix Sum
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Find Maximum Subarray Sum
        int maxSum = maxSubArraySum(prefixSum);

        System.out.println(maxSum); // Output: 6 (i.e. 4 + (-1) + 2 + 1)
    }

    private static int maxSubArraySum(int[] prefixSum) {
        int maxSum = Integer.MIN_VALUE;
        int minPrefixSum = 0;
        for (int i = 0; i < prefixSum.length; i++) {
            maxSum = Math.max(maxSum, prefixSum[i] - minPrefixSum);
            minPrefixSum = Math.min(minPrefixSum, prefixSum[i]);
        }
        return maxSum;
    }
}
