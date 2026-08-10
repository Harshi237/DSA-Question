class Solution {
    public boolean checkRecord(String s) {
        int n = s.length();

        int absCount = 0;
        int lateCount = 0;

        for(int i=0; i<n;i++){
            char ch = s.charAt(i);

            if(ch=='A') {
                absCount++;
                if(absCount>=2) return false;
            }
            if (ch=='L'){
                lateCount++;
                if(lateCount>=3) return false;
            }
            else lateCount = 0;
        }
        return true;

    }
}