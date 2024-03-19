public class checker {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1};
        int n = arr.length;
        System.out.println(maximumSumAfterOperation(arr, n));
    }

    public static int maximumSumAfterOperation(int[] arr, int n) {
        int[] dp = new int[n];
        dp[0] = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }

        for (int i = 1; i < n; i++) {
            maxSum = Math.max(maxSum, arr[i] * arr[i]);
        }

        return maxSum;
    }
}
