//383. Ransom Note

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      int c[] = new int[26];
        for(char i: magazine.toCharArray()){
            c[i-'a']++;
        }
        for(char i: ransomNote.toCharArray()){
            c[i-'a']--;
            if(c[i-'a'] == -1)
                return false;
        }
        return true;
    }
}
