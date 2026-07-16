class Solution {
    Integer[][] dp;
    public int splitArray(int[] nums, int k) {
        dp = new Integer[nums.length][k+1];
        return solve(nums, 0, k);
    }
    public int solve(int[] nums, int idx, int k){
        if(k==1){
            int sum = 0;
            for(int i=idx; i<nums.length; i++){
                sum+=nums[i];
            }
            return sum;
        }
        if(dp[idx][k]!=null) return dp[idx][k];
        int currSum = 0;
        int ans = Integer.MAX_VALUE;

        for(int i = idx ; i<=nums.length-k; i++){
            currSum += nums[i];
            int largest = Math.max(currSum, solve(nums, i+1, k-1));

            ans = Math.min(ans,largest);
        }
        return dp[idx][k]=ans;
    }
}