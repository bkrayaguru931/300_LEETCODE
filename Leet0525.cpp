//525. Contiguous Array



class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int c=0, length=0;
         map<int,int> m;
        
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==0)
                c++;
            else
                c--;
            if(c==0)
                length=max(length,i+1);           
            else if(m.find(c)!=m.end())
               // cout<<i<<" "<<m[c];
                length=max(length,i-m[c]);
            else
                m[c]=i;
            
        }
        return length;
        
    }
};
