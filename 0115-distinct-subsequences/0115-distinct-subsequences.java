class Solution {
    // public int numDistinct(String s, String t) {
    //     int n = s.length();
    //     int m = t.length();

    //     int[][] dp = new int[n + 1][m + 1];

    //     for (int i = 0; i <= n; i++) {
    //         dp[i][0] = 1;
    //     }

    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= m; j++) {
    //             if (s.charAt(i - 1) == t.charAt(j - 1)) {
    //                 dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
    //             } else {
    //                 dp[i][j] = dp[i - 1][j];
    //             }
    //         }
    //     }

    //     return dp[n][m];
    // }
    // public int numDistinct(String s, String t) {
    //     int n = s.length();
    //     int m = t.length();

    //     return solveR(n, m, s,t);
    // }
    // public int solveR(int i, int j, String s, String t){
    //     if(j==0) return 1; 

    //     if(i==0) return 0;

    //     if(s.charAt(i-1) == t.charAt(j-1)){
    //         return solveR(i-1,j-1,s,t) + solveR(i-1,j,s,t);
    //     }else{
    //         return solveR(i-1,j,s,t);
    //     }

    // }
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[] prev = new int[m + 1];
        int[] curr = new int[m + 1];
        prev[0] = 1;

        for (int i = 1; i <= n; i++) {
            curr[0] = 1;
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    curr[j] = prev[j - 1] + prev[j];
                } else {
                    curr[j] = prev[j];
                }
            }

            int[] temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[m];
    }

}
