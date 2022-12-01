//1668. Maximum Repeating Substring



class Solution {
    public int maxRepeating(String sequence, String word) {
         String toBeFound = word;
         int ans=0;
         while(sequence.contains(toBeFound)){
             toBeFound+=word;
             ans++;
         }
         return ans;
    }
}
