//1351. Count Negative Numbers in a Sorted Matrix




class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
         int neg = 0, m = grid.size(), n = grid[0].size();
        for(int i = 0;  i < m; i++){
            int r = n-1;
            int l = 0;
            while(l <= r){
                int mi = l + (r-l)/2;
                if(grid[i][mi] < 0)
                    r = mi-1;
                else
                    l = mi+1;
            }
            neg += n-l;
        }
        return neg;
    }
};
