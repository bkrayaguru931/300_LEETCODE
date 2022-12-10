


class Solution {
public:
    vector<vector<int>> diagonalSort(vector<vector<int>>& mat) {

     unordered_map<int, priority_queue<int,vector<int>,greater<int>>> mp;
        int m = mat.size();
        int n = mat[0].size();
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mp[i-j].push(mat[i][j]);
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j] = mp[i-j].top();
                mp[i-j].pop();
            }
        }
        return mat;


    //      int m=mat.size();
    // int n=mat[0].size();
    // map<int,vector<int>> ma;        
    
    // for(int i=0;i<m;i++)            
    //    for(int j=0;j<n;j++)           
    //        ma[i-j].push_back(mat[i][j]);                  
                      
    // for(int i=-(n-1);i<=m-1;i++)                
    //        sort(ma[i].begin(),ma[i].end());               
    
    
    // for(int i=0;i<m;i++)        
    //     for(int j=0;j<n;j++)
    //     {
    //         mat[i][j]=*ma[i-j].begin();
    //         ma[i-j].erase(ma[i-j].begin());
    //     }
            
    // return mat;
    }
};
