class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] coins = new int[3];

        for(int i=0; i<bills.length; i++){
            if(bills[i]==5){
                coins[0]++;
            }
            else if(bills[i]==10){
                coins[1]++;
                if(coins[0]>=1)coins[0]--;
                else return false;
            }
            else{
                coins[2]++;
                if(coins[1]>=1 && coins[0]>=1){
                    coins[1]--;
                    coins[0]--;
                }
                else if(coins[0]>=3) coins[0]-=3;
                else return false;
                
            }
        }
        return true;
    }
}