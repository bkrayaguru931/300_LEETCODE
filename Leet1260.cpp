




//1260. Shift 2D Grid



class Solution {
public:
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {
        int m=grid.size();
        int n=grid[0].size();
        for(int i = 0; i < k; ++i) {
            for(int row = 0; row < m; ++row) {
                for(int col = 0; col < n; ++col) {
                    int x = grid[m-1][n-1];
                    grid[m-1][n-1] = grid[row][col];
                    grid[row][col] = x;
                }
            }
        }
        
        return grid;

 //      int n = grid.size();
    // int m = grid[0].size();
        
    // while(k > 0)
    // {
    //     auto temp = grid;
            
    //     for(int i = 0; i < n; ++i)
    //     {
    //         for(int j = 0; j < m - 1; ++j)
    //         {
    //             temp[i][j + 1] = grid[i][j];
    //         }
    //     }
            
    //     for(int i = 0; i < n - 1; ++i)
    //     {
    //         temp[i + 1][0] = grid[i][m - 1];
    //     }
            
    //     temp[0][0] = grid[n - 1][m - 1];
            
    //     grid = temp;
            
    //     --k;
    // }
        
    // return grid;
    }
};
