class Solution:
    def checkRecord(self, s: str) -> bool:
        n = len(s)
        absCount =  0
        lateCount = 0
        for i in range(n):
            ch = s[i]
            if ch=='A' :
                absCount+=1
                if(absCount>=2) : return False
            if ch=='L':
                lateCount+=1
                if(lateCount>=3): return False
            
            else: lateCount = 0
        return True
