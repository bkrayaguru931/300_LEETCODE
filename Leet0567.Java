//567. Permutation in String


class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] s1char=new int[26];
        int [] s2char=new int[26];
        int left=0,right=0;
        while(right<s1.length()){ 
         s1char[s1.charAt(right)-'a']++;
         s2char[s2.charAt(right)-'a']++;
         right++;
         }
         right--; 
        while(right<s2.length()){
       if(Arrays.equals(s1char,s2char))
        return true;
         right++;
        if(right<s2.length()) 
        s2char[s2.charAt(right)-'a']++; 
        s2char[s2.charAt(left)-'a']--; 
         left++;
         }
        return false;
    }
}
