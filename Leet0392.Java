



class Solution {
    public boolean isSubsequence(String s, String t) {
//         int k = 0;
	  
//         for(int i = 0; i < t.length(); i++){
//             if(t.charAt(i) == s.charAt(k))
//                 k++;
//         }
		
//         if(k == s.length()){
//             return true;
//         }
       
//        return false;
        
                        //OR
                        
                        
        return Issubs(s,t,s.length(),t.length());   
    }
    static boolean Issubs(String s , String t , int n , int m)
    {
        if(n==0)
        {
            return true;
        }
        if(m==0)
        {
            return false;
        }
        
        if(s.charAt(n-1)==t.charAt(m-1))
        {
            return Issubs(s,t,n-1,m-1);
        }
        return Issubs(s,t,n,m-1);
    }
}
