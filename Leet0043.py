//43. Multiply Strings




class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        a, b = list(num1), list(num2)        
        n, m = len(b)-1, len(a)-1        
        j, res = 1, 0        
        for x in range(n, -1, -1):
            stepRes = 0            
            t = 1
            for y in range(m, -1, -1):                    
                stepRes += int(a[y]) * int(b[x]) * t                
                t *= 10                    
            stepRes *= j            
            j *= 10        
            res += stepRes        
        return str(res)
