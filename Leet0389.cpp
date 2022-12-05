//389. Find the Difference



class Solution {
public:
    char findTheDifference(string s, string t) {
        int sum1 = 0;
        int sum2 = 0;

        for (auto &c: t) sum1+=c;
        for (auto &c: s) sum2+=c;
        int diff=sum1-sum2;
        return (char)diff;
    }
};
