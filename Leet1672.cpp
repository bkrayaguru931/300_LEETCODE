//1672. Richest Customer Wealth





class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int cnt=0;
        int M = accounts.size();
        int N = accounts[0].size();
        for(int i=0;i<M;i++){
                int x=0;
               for(int j=0;j<N;j++){
                x+=accounts[i][j];
               }
                cnt = max(cnt,x);

        }
        return cnt;
       
    }
};
