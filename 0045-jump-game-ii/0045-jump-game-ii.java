class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n-1] = 0;
        for(int i=n-2; i>=0; i--){
            for(int jump = 1; jump<=nums[i] && i+jump<n ;jump++){
                if(dp[i+jump]!=Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i],dp[i+jump]+1);
                }
            }
        }
        return dp[0];
    }

}