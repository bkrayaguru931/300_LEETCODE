//1605. Find Valid Matrix Given Row and Column Sums




class Solution {
public:
    vector<vector<int>> restoreMatrix(vector<int>& row, vector<int>& col) {
          vector<vector<int>> ans(row.size(),vector<int> (col.size(),0));
        for(int i = 0 ; i < row.size() ; i++){
            for(int j = 0 ; j < col.size() ; j++){
                ans[i][j] = min(col[j],row[i]);
                col[j] -= ans[i][j];
                row[i] -= ans[i][j];
            }
        }
        return ans;

        
    }
};
