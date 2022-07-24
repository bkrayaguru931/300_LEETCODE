//240. Search a 2D Matrix II


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        
        while(i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) j--;
            else if(matrix[i][j] < target) i++;
        }
        return false;
        
        
        //or
        
        
        
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[0].length; j++){
        //         if(matrix[i][j] == target) return true;
        //     }
        // }
        // return false;
    }
}
