class Solution {
    public int bitwiseComplement(int n) {
        int ans=0;
        int count=1;
            
        if(n==0){
            return 1;
        }
        
        while(n>0){
            ans += count * (n%2==0? 1:0);
            count *=2;
            n/=2;
        }
        
        return ans;
    }
}
