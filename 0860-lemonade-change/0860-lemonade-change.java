class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int tens=0;

        for(int i=0; i<bills.length; i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                tens++;
                if(five>=1) five--;
                else return false;
            }
            else{
                if(tens>=1 && five>=1){
                    tens--;
                    five--;
                }
                else if(five>=3) five-=3;
                else return false;
                
            }
        }
        return true;
    }
}