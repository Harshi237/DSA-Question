class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long thres = 1000;
        while(thres <= n){
            ans +=(long)n - thres + 1;
            thres *=1000;
        }
        return ans;
    }
}