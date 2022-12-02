//76. Minimum Window Substring






class Solution {
public:
string minWindow(string s, string t) {
        int i = 0,j=0;
        int len = s.length();
        unordered_map<char,int> mp;
        for(auto i:t)
            mp[i]++;
        int count = mp.size();
        string ans = "";
        int res = INT_MAX;        
        while(j<len)
        {
            if(mp.find(s[j])!=mp.end())//character is in string t
            {
                mp[s[j]]--;
                if(mp[s[j]]==0)
                    count--;
            }
            if(count>0)//keep adding new character until entire t string is in window
            { 
                j++;
                continue;
            }
            
            while(mp.find(s[i])==mp.end()||mp[s[i]]<0)
            {
                if(mp.find(s[i])==mp.end())//character not a part of string t
                    i++;
                if(mp.find(s[i])!=mp.end())//character is in string t but more than required
                {
                    if(mp[s[i]]<0)
                    {
                        mp[s[i]]++;
                        i++;
                    }
                }
            }

            if(count==0)//all characters of string t exists in our window
            {
                if(res>(j-i+1))//current window is smaller than previous
                {
                    res = j-i+1;
                    ans = s.substr(i,res);
                }
            }
            
            j++;//move window for new possible answers
        }

        return ans;
    }


               //*********IF ONLY MINIMUM LENGTH ASKED***********//




//     string minWindow(string s, string s1) {
//     unordered_map<char,int> mp;
//     for(int i=0 ; i<s1.length();i++  )
//      mp[s1[i]]++;
//     int ans=INT_MAX;
//     int i=0,j=0;
//     int count=mp.size();

// // starting to  solve

//     while(j<s.length())
//     {
//       // CALCULATION STEP ( As Aditya's general format)

//        if(mp.find(s[j])!=mp.end())
//        {
//            mp[s[j]]--;
//            if(mp[s[j]]==0)
//            count--;
//        }

// // step to slide " j "

//        if(count>0)
//        j++;

// // step where we will find a candidate for answer

//        else if(count==0)
//        {
//            ans=min(ans,j-i+1);    // A candidate for our Answer

// // trying to minimize the window size after getting a candidate for answer

//            while(count==0)
//            {
//                if(mp.find(s[i])==mp.end())
//                {
//                    i++;
//                    ans=min(ans,j-i+1);   // updating the answer
//                }
//                else
//                {
//                    mp[s[i]]++;
//                    if(mp[s[i]]>0)
//                    {
//                        i++;
//                        count++;
//                    }
//                    else
//                    {
//                        i++;
//                        ans=min(ans,j-i+1);   // updating the answer
//                    }
//                }
//            }
//            j++;
//        }
//     }
//     return ans;
 //   }
};
