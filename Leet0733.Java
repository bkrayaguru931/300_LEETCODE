//733. Flood Fill


class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int y=image[sr][sc];
        int row=image.length;
        int col=image[0].length;
      
                convert(row,col,sr,sc,image,newColor,y);
       
        return image;
    }
    public void convert(int row,int col,int i,int j,int image[][],int nc,int y)
    {
        if(i<0 || j<0 || i>=row || j>=col || image[i][j]==nc || image[i][j]!=y )
        return ;
        image[i][j]=nc;
        convert(row,col,i+1,j,image,nc,y);
        convert(row,col,i,j+1,image,nc,y);
        convert(row,col,i,j-1,image,nc,y);
        convert(row,col,i-1,j,image,nc,y);
        return;
    }
}
