class Solution {
    // public int longestPalindromeSubseq(String s) {
    //     int n = s.length();
    //     int[][] dp = new int[n][n];

    //     for (int i = n - 1; i >= 0; i--) {
    //         dp[i][i] = 1;
    //         for (int j = i + 1; j < n; j++) {
    //             if (s.charAt(i) == s.charAt(j)) {
    //                 dp[i][j] = 2 + dp[i + 1][j - 1];
    //             } else {
    //                 dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
    //             }
    //         }
    //     }
    //     return dp[0][n - 1];
    // }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();

        String s2 = new StringBuilder(s).reverse().toString();

        int[][] dp = new int[n+1][n+1];

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i -1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][n];
    }
}