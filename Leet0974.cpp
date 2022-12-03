//974. Subarray Sums Divisible by K






class Solution {
public:
    int subarraysDivByK(vector<int>& v, int k) {
         vector<int>mp(k);
        mp[0]=1;
        int n=v.size(),t=0,res=0;
        for(int i=0;i<n;++i){
            t+=v[i];
            int rem=((t%k)+k)%k;
            res+=mp[rem]++;     
        }
        return res;
    }
};
