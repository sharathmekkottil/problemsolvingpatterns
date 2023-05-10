/**
 * Suppose we have an array arr of integers [1, 3, 2, 4, 5, 7, 6, 8, 9]. 
 * We want to be able to quickly compute the sum of all integers in a given range of indices in the array. Question from 2 to 5
 */
public class RangeSumQuery {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 7, 6, 8, 9};
        int[] prefixSum = new int[arr.length];
        
        // Compute Prefix Sum
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        
        // Compute Sum of Range [2, 5]
        int start = 2;
        int end = 5;
        int sumInRange = prefixSum[end] - prefixSum[start-1];
        System.out.println(sumInRange); // Output: 11 (i.e. 2+4+5)
    }
}
