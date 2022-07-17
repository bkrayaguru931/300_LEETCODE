//2342. Max Sum of a Pair With Equal Sum of Digits



class Solution {
public:
    int sum_digit(int e){
        int ret=0;
        while(e){
            ret+=e%10;
            e/=10;
        }
        return ret;
    }
    int maximumSum(vector<int>& nums) {
        vector<int> MX(90,-1);
        vector<int> MX2(90,-1);
        
        for(auto e:nums){
            int ds =sum_digit(e);
            if(MX[ds]==-1) MX[ds]=e;
            else{
                if(MX[ds]<e){
                     MX2[ds]=max(MX[ds],MX2[ds]);
                    MX[ds]=e;
                }
                else{
                    if(MX2[ds]==-1)MX2[ds]=e;
                    else if(MX2[ds]<e)MX2[ds]=e;
                }
                   
            }
        }
        int mx=-1;
        for(int i=0;i<90;i++){
            if(MX[i]==-1||MX2[i]==-1) continue;
            mx=max(mx,MX[i]+MX2[i]);
        }
        return mx;
    }
};
