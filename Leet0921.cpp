class Solution {
public:
    int minAddToMakeValid(string S) {

        int c = 0;
        stack <char> st;
        for(int i=0;i<S.length();i++) {
            if(st.empty()) { 
                st.push(S[i]); 
                continue; 
                }
            if(S[i] != st.top()) {
                if(S[i] == ')' && st.top() == '(') 
                st.pop();
                else st.push(S[i]);
            }
            else st.push(S[i]);
        }
        return st.size();



        //  int count = 0;
        // int total = 0;
        // for (int i = 0; i < s.size(); ++i)
        // {
        //     if (s[i] == '(')
        //     {
        //         if (count < 0)
        //         {
        //             total += abs(count);
        //             count = 0;
        //         }
        //         ++count;
        //     }
        //     else // ')'
        //     {
        //         --count;
        //     }
        // }
        // total += abs(count);
        
        // return total;
    }
};
