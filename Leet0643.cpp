//643. Maximum Average Subarray I




class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {     
        int n=nums.size();
        double ans=INT_MIN;
        int sum=0;
        if(nums.size()==0){
            return 0; 
        }
        int i=0,j=0;
        while(j<n){
           sum+=nums[j];
           double avg=(double)sum/k;
           if(j-i+1==k){
               ans=max(ans,avg);
               sum-=nums[i]; 
               i++;
               j++;
           }
           else j++;
       }
    return ans;
    }
};
