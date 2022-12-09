//2133. Check if Every Row and Column Contains All Numbers


class Solution {
public:
    bool checkValid(vector<vector<int>>& matrix) {
       int n = matrix.size();
        for (int r = 0; r < n; ++r) 
        {
            set<int> row;
            set<int> col;
            for (int c = 0; c < n; ++c) 
            {
                row.insert(matrix[r][c]);
                col.insert(matrix[c][r]);
            }
            if (row.size() < n || col.size() < n) 
            {
                return false;
            }
        }
        return true;
    }
}
