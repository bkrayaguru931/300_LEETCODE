//164. Maximum Gap






class Solution {
public:
    //bucket sort
    int maximumGap(vector<int>& nums) {
        int len = nums.size();
        if(len < 2){
            return 0;
        }
        int minValue = INT_MAX;
        int maxValue = INT_MIN;
        for(int i : nums){
            minValue = min(minValue, i);
            maxValue = max(maxValue, i);
        }
        int gap = ceil(double((maxValue - minValue))/ (len - 1));
        vector<int> minGaps(len - 1, INT_MAX);// the minmum value of each bucket
        vector<int> maxGaps(len - 1, INT_MIN);
        for(int i : nums){ // fill in the bucket
            if(i == minValue || i == maxValue){
                continue;
            }
            int gapidx = (i - minValue) / gap;
            minGaps[gapidx] = min(minGaps[gapidx], i);
            maxGaps[gapidx] = max(maxGaps[gapidx], i);
        }
        int pre = minValue;
        int ans = INT_MIN;
        for(int i = 0; i < len - 1; ++i){
            if(minGaps[i] == INT_MAX && maxGaps[i] == INT_MIN){
                continue;
            }
            ans = max(ans, minGaps[i] - pre);
            pre = maxGaps[i];
        }
        ans = max(ans, maxValue - pre);
        return ans;
    }
};
