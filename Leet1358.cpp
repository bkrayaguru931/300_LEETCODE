//1358. Number of Substrings Containing All Three Characters




class Solution {
public:
    int numberOfSubstrings(string s) 
    {
        int total = 0;
        vector<int> v(3,0);
        int n = s.length();
        int i = 0;
        int j = 0;
        
        while (j < s.length()) {
            v[s[j] - 'a']++;
            if (!(v[0] >= 1 && v[1] >= 1 && v[2] >= 1)) {
                j++;
            }
            else {
                while (v[0] >= 1 && v[1] >= 1 && v[2] >= 1) {
                    total += (n - j);
                    v[s[i] - 'a']--;
                    i++;
                }
                j++;
            }
        }
        
        return total;
    }
};
