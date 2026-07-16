class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l= 1;
        int high = 0;
        for(int i=0; i<n; i++){
            high = Math.max(high, piles[i]);
        }

        while(l<=high){
            int mid = l+(high-l)/2;
            long hours = 0;
            for(int pile : piles){
                hours += (pile+mid-1)/mid;
            }
            if(hours<=h) high = mid-1;
            else l=mid+1;
        }
        return l;
    }
}