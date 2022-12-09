//1886. Determine Whether Matrix Can Be Obtained By Rotation




class Solution {
public:
    void rotate90(vector<vector<int>>& nm) {
        int n = nm.size();
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                swap(nm[i][j], nm[j][i]);
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n / 2; j++) {
                swap(nm[i][j], nm[i][n - j - 1]);
            }
        }
    }
    bool isEqual(vector<vector<int>>& mat1, vector<vector<int>>& mat2) {
        int n = mat1.size();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(mat1[i][j] != mat2[i][j]) return false;
            }
        }
        return true;
    }
    bool findRotation(vector<vector<int>>& mat, vector<vector<int>>& target) {
        for(int i = 0; i < 4; i++) {
            rotate90(mat);
            if(isEqual(mat, target)) return true;
        }
        return false;
    }
};
