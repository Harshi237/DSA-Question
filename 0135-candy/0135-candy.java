class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        
        int up=0;
        int down = 0;
        int peak = 0;
        int candy = 0;

        for(int i=1; i<n; i++){
            if(ratings[i]>ratings[i-1]){
                up++;
                peak=up;
                down =0;
                candy+=up+1;
            }
            else if(ratings[i]==ratings[i-1]){
                up=0;
                down=0;
                peak=0;
                candy+=1;
            }
            else{
                down++;
                up=0;
                candy+=down;
                if(down>peak) candy++;
            }
        }
        
        return candy+1;
    }
}