//97. Interleaving String



class Solution {
   
        Boolean[][][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        
        int s1Len = s1.length(), s2Len = s2.length(), s3Len = s3.length();
        
        dp = new Boolean[s1Len+1][s2Len+1][s3Len+1];
		
        if((s1Len+s2Len) != s3Len) return false;
        
        return solve(s1,s2,s3,0,0,0);
    }
    
    private boolean solve(String s1, String s2, String s3, int i1, int i2, int j){
        
        
        if(j == s3.length()) return true;
        
        if(dp[i1][i2][j] != null) return dp[i1][i2][j];
       
        if(i1 == s1.length() && i2 != s2.length())
            return dp[i1][i2][j] = (s2.charAt(i2)==s3.charAt(j)) && solve(s1,s2,s3,i1,i2+1,j+1);
        else if(i1 != s1.length() && i2 == s2.length())
            return dp[i1][i2][j] = (s1.charAt(i1)==s3.charAt(j)) && solve(s1,s2,s3,i1+1,i2,j+1);
        
        char s1C = s1.charAt(i1), s2C = s2.charAt(i2), s3C = s3.charAt(j);

        if(s1C == s3C && s2C != s3C)
            return dp[i1][i2][j] = solve(s1,s2,s3,i1+1,i2,j+1);
        else if (s1C != s3C && s2C == s3C)
            return dp[i1][i2][j] = solve(s1,s2,s3,i1,i2+1,j+1);
        else if(s1C == s3C && s2C == s3C)
            return dp[i1][i2][j] = solve(s1,s2,s3,i1,i2+1,j+1) || solve(s1,s2,s3,i1+1,i2,j+1);
      
        else return dp[i1][i2][j] = false;
    } 
    
}
