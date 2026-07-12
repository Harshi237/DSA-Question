class Solution {
    Integer[] dp ;
    public int jump(int[] nums) {
        dp = new Integer[nums.length];
        return solve(0, nums);
    }

    public int solve(int idx, int[] nums) {
        if (idx >= nums.length - 1)
            return 0;
        
        if(dp[idx]!=null) return dp[idx];

        int minJump = Integer.MAX_VALUE;

        for (int jump = 1; jump <= nums[idx]; jump++) {
            int ans = solve(idx + jump, nums);
            if (ans!=Integer.MAX_VALUE)
                minJump = Math.min(minJump, ans);
        }
        if(minJump==Integer.MAX_VALUE) return dp[idx]=Integer.MAX_VALUE;

        return dp[idx] =  minJump + 1;
    }
}