//686. Repeated String Match





 class Solution 
{ 
	static int repeatedStringMatch(String A, String B) 
	{ 
        // Your code goes here
        String sA=A;
        int repeat=B.length()/A.length();
        int count=1;
        for(int i=0;i<repeat+2;i++){
            if(A.contains(B))
            return count;
            else{
                A+=sA;
             count++;
            }
        }
        return -1;
	} 
} 
