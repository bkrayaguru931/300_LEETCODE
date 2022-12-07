//54. Spiral Matrix




class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
    int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
    while(left <= right && top <= bottom){
        for(int j=left;j<=right&&top <= bottom;j++){
            ans.add(matrix[top][j]);
        }
        top++;
        for(int i=top;i<=bottom&&left <= right;i++){
            ans.add(matrix[i][right]);
        }
        right--;
        for(int j=right;j>=left&&top <= bottom;j--){
            ans .add(matrix[bottom][j]);
        }
        bottom--;
        for(int i=bottom;i>=top&&left <= right;i--){
            ans.add(matrix[i][left]);
        }
        left++;
    }
    return ans;
    }
}
