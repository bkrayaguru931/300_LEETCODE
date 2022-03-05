//1572. Matrix Diagonal Sum


class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        for(int i =0 ;i<len ;i++){
            sum = sum + mat[i][i];
            sum = sum + mat[i][len-1-i];
        }
        if(len%2!=0) {
            sum =sum - mat[len/2][len/2];
        }
    return sum;
    }
}
