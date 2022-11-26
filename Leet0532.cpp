//532. K-diff Pairs in an Array





class Solution{
public:
    int findPairs(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int ans=0,i=0,j=1;
        while(i<nums.size()&&j<nums.size())
        {
                if(nums[j]-nums[i]==k)
                {
                    ans++;
                    j++;
                    i++;
                   while(j<nums.size()&&nums[j]==nums[j-1]){
                       j++;
                   }
                }
                    else if(nums[j]-nums[i]>k){
                          i++;
                          if(j-i==0)
                          j++;          
                }
                else j++;
            
        }
        return ans;
    }
};
 
