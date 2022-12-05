//424. Longest Repeating Character Replacement




class Solution {
public:
    int characterReplacement(string s, int k) {
         int n = s.length();
        map<char,int> mp;
        int ans=0,maxa=INT_MIN;
        int i=0,j=0;
        for(i=0;i<n;i++){
            mp[s[i]]++;
            maxa = max(maxa,mp[s[i]]);
            
            while(i-j+1-maxa>k){
                mp[s[j]]--;
                maxa = max(maxa,mp[s[j]]);
                j++;
            }
            ans = max(ans,i-j+1);
        }
        return ans;
    }
};
