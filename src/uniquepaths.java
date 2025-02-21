public class uniquepaths {
    public static void main(String[] args){
        int m = 3, n = 7;
        System.out.println("Unique Paths: " + uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];  // Create a DP table of size m x n

        // Initialize first row and first column
        for (int i = 0; i < m; i++) dp[i][0] = 1;  // Only one way to move down
        for (int j = 0; j < n; j++) dp[0][j] = 1;  // Only one way to move right

        // Fill the DP table using the transition formula
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
