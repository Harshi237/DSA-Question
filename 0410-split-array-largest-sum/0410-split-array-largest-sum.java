class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;

        int low = 0;
        int high = 0;

        for(int i=0; i<n; i++){
            low = Math.max(nums[i], low);
            high += nums[i];
        }

        while(low<=high){
            int mid = low + (high-low)/2;

            int count = 1;
            int sum = 0;

            for(int num : nums){
                if(sum+num<=mid) sum += num;

                else {
                    count++;
                    sum = num;
                }
            }
            if(count<=k) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}