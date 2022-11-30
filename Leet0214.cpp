//214. Shortest Palindrome




class Solution {
public:
    string shortestPalindrome(string s) {
        string rev=s;
        reverse(rev.begin(),rev.end());
        string temp=s+'#'+rev;
        //kmp  lps
        int n=temp.length();
        vector<int> lps(n,0);
        int i = 0, j = 1;
        while(j < n) {
            if(temp[i] == temp[j]) {
                i++;
                lps[j] =i;
                j++;
            } 
            else {
                if(i != 0){
                    i = lps[i-1];
                }
                else {
                    lps[j] = 0;
                    j++;
                }
            }
        }
        temp=s.substr(lps[n-1]);
        reverse(temp.begin(),temp.end());
        return temp+s;
    }
};
