//2461. Maximum Sum of Distinct Subarrays With Length K




class Solution {
public:
    long long maximumSubarraySum(vector<int>& nums, int k) {
         long long mx = 0,sum = 0,ln = 0;
        unordered_map <int,int> ump;
        int n=nums.size();
        int i=0,j=0;
        while(j < n){
            while(ump[nums[j]] > 0 || ln >= k)
                ump[nums[i]]--,sum -= nums[i],i++,ln--;
            sum += nums[j];
            ump[nums[j]]++;
            ln++;
            if(ln == k)  
                mx = max(mx,sum);   
            j++;    
        }
        return mx;
    }
};
