//2343. Query Kth Smallest Trimmed Number


class Solution {
public:
    vector<int> smallestTrimmedNumbers(vector<string>& nums, vector<vector<int>>& queries) {
        int dlen=(int)nums[0].size();
        vector<vector<int>> rank(dlen+1);
        vector<pair<string,int>> B(nums.size());
        for(int i=0;i<=dlen;i++) rank[i].resize(nums.size()+1);
        vector<int>A(nums.size());
        for(int i=1;i<=dlen;i++) {
            B.clear();
            B.resize(nums.size());
            for(int j=0;j<nums.size();j++){
                B[j].first= nums[j].substr(dlen-i,i);
                B[j].second=j;
            }
           
            sort(B.begin(),B.end());
            for(int k=0;k<nums.size();k++) rank[i][k]=B[k].second;
        }
        vector<int> ansv(queries.size());
        int idx=0;
        for(auto vec:queries){
            int k=vec[0],trim=vec[1];
            ansv[idx++]=rank[trim][k-1];
        }
       
        return ansv;
    }
};
