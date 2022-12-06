//791. Custom Sort String




class Solution {
public:
    string customSortString(string order, string str) {

        string s1, s2;
        int a[26]={0};
        for(char c: order) a[c-'a']++;
        for(char c: str){
            if(a[c-'a']==0) s2+=c;
            else a[c-'a']++;
        }
        for(char c: order){
            while(a[c-'a']>1){
                s1+=c; 
                a[c-'a']--;
            } 
        }
        return s1+s2;
}


    // string customSortString(string S, string T) {
    //     //store all the chars into a hashset
    //     unordered_set<int> s(S.begin(), S.end());
    //     unordered_map<char, int> m;
        
    //     //calculate the frequency of each character in T iff it is also in S
    //     for(auto& each: T)
    //         if(s.count(each))
    //             m[each]++;
        
    //     //construct string str as per the custom sort order of S (check the hashmap for required frequencies)
    //     string str;
    //     for(auto& c: S) {
    //         int val=m[c];
    //         while(val--)
    //             str+=c;
    //     }
        
    //     //simply append the remaining characters to str...
    //     for(auto& each: T)
    //         if(!s.count(each))
    //             str+=each;
            
    //     return str;
    // }

};
