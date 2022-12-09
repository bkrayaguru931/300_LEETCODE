
class Solution {
public:
vector<vector<int>> onesMinusZeros(vector<vector<int>>& grid) 
    {
        int m=grid.size(), n=grid[0].size();
        vector<int> row1(m), row0(m), col1(n), col0(n); 
        
        //storing 0s and 1s count for each row
        int r0, r1;
        for(int i=0; i<m; i++)
        {
            r0=0, r1=0;
            for(int j=0; j<n; j++)
            {
                if(grid[i][j]==0)
                    r0++;
                else r1++;
                    
            }
            row1[i] = r1;
            row0[i] = r0;
        }
        
        //storing 0s and 1s count for each column
        int c0, c1;
        for(int j=0; j<n; j++)
        {
            c0=0, c1=0;
            for(int i=0; i<m; i++)
            {
                if(grid[i][j]==0)
                    c0++;
                else c1++;
                    
            }
            col1[j] = c1;
            col0[j] = c0;
        }
        
        vector<vector<int>> diff(m, vector<int> (n, 0));
        
        //apply formula
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                diff[i][j] = row1[i] + col1[j] - row0[i] - col0[j];
            }
        }
        
        return diff;
        
    }

         //WRONG ANSWER
    // vector<vector<int>> onesMinusZeros(vector<vector<int>>& matrix) {
    //     int m=matrix.size(), n=matrix[0].size();
    //     vector<int> row1(m), row0(m), col1(n), col0(n); 


    //     int onesRow=0;
    //     int onesCol=0;
    //     int zerosRow=0;
    //     int zerosCol=0;

    //      for(int i = 1; i < m; i++){
    //         for(int j = 1; j < n; j++){
    //             if(matrix[i][0]==0)
    //             zerosRow++;

    //             if(matrix[i][0]==1)
    //             onesRow++;

    //             if(matrix[0][j]==0)
    //             zerosCol++;

    //             if(matrix[0][j]==1)
    //             onesCol++;

    //         row1[i] = onesRow;
    //         row0[i] = zerosRow;
    //         col1[j] = onesCol;
    //         col0[j] = zerosCol;
    //         }
    //         }
           
    //          vector<vector<int>> diff(m, vector<int> (n, 0));
        
    //     
    //     for(int i=0; i<m; i++)
    //     {
    //         for(int j=0; j<n; j++)
    //         {
    //             diff[i][j] = row1[i] + col1[j] - row0[i] - col0[j];
    //         }
    //     }
        
    //     return diff;
    // }
};
