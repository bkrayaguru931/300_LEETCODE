//771. Jewels and Stones



class Solution {
public:
    int numJewelsInStones(string J, string S) {
        int res = 0;
        unordered_set<char> mp;
        
        for(char ch : J)
            mp.insert(ch);
        
        for(char ch : S)
        {
            if(mp.find(ch) != mp.end())
                res++;
        }
        
        return res;
    }
};
