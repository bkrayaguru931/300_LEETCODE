//2341. Maximum Number of Pairs in Array



class Solution {
public:
    vector<int> numberOfPairs(vector<int>& nums) {
        map<int ,int> ss;
        int cnt=0,ans= 0;
        for(auto e: nums){
            ss[e]++;
        }
        for(auto pp:ss){
            int num=pp.second;
            if(num&1) ans++;
            cnt+=num/2;
        }
        vector<int> v(2); v[0]=cnt; v[1]=ans;
        return v;
    }
};
