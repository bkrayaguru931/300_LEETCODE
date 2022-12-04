////2256. Minimum Average Difference




class Solution {
public:
    int minimumAverageDifference(vector<int>& nums) {
        long sum=0,currSum=0;
        int n=nums.size();
        for(int i : nums)
        sum+=i;
        int mini=INT_MAX,ans=0;
        for(int i=0;i<n;i++){
            currSum+=nums[i];
            int avg1=currSum/(i+1);
            if(i==n-1){
                if(avg1<mini) 
                return n-1;
                else break;
            }
            int avg2=(sum-currSum)/(n-i-1);
            if(abs(avg1-avg2)<mini){
                mini=abs(avg1-avg2);
                ans=i;
            }
        }
        return ans;
    }
};
