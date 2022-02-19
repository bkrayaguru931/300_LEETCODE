//74. Search a 2D Matrix


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int x = 0;
        int y = 0;
        
        while(x < matrix.length && y < matrix[0].length){
            if(matrix[x][y] == target)
              return true;
            
            else if(target > matrix[x][matrix[0].length-1])
                x++;
            
            else
                y++;
            
        }
        return false; 
    }
}
