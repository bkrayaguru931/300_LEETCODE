


//387. First Unique Character in a String


class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        int idx = -1;
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);            
            arr[ch - 'a']++;
        }        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);            
            if(arr[ch - 'a'] == 1) {
                idx = i;
                break;
            }
        }        
        return idx;
    }
}
