
**Prefix Sum**

Prefix Sum is a technique used in computer science to efficiently compute the cumulative sum of a sequence of numbers. It involves preprocessing the sequence to generate an array, where the value at each index is the sum of all elements up to and including that index. This array can then be used to quickly compute the sum of any subarray within the original sequence.

**Example**

Suppose we have an array arr of integers:
```java
arr = [2, 4, 1, 7, 5, 3]
```

How to find?

```java
prefix_sum[0] = arr[0] = 2
prefix_sum[1] = arr[0] + arr[1] = 2 + 4 = 6
prefix_sum[2] = arr[0] + arr[1] + arr[2] = 2 + 4 + 1 = 7
prefix_sum[3] = arr[0] + arr[1] + arr[2] + arr[3] = 2 + 4 + 1 + 7 = 14
prefix_sum[4] = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] = 2 + 4 + 1 + 7 + 5 = 19
prefix_sum[5] = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] = 2 + 4 + 1 + 7 + 5 + 3 = 22
```
Result:

```java
prefix_sum = [2, 6, 7, 14, 19, 22]
```

Java Example code block for finding prefix sum

```java
public static int[] computePrefixSum(int[] arr) {
    int[] prefixSum = new int[arr.length];
    prefixSum[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
        prefixSum[i] = prefixSum[i-1] + arr[i];
    }
    return prefixSum;
}
```

