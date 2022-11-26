//4 Sum



class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
         vector<vector<int>> v;
      sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size(); i++){
        if(i != 0 && nums[i] == nums[i - 1]) continue;
        for(int j = i + 1; j < nums.size(); j++)
        {
          if(j != i + 1 && nums[j] == nums[j - 1]) continue;
          int s = j + 1;
          int e = nums.size() - 1;
          while(s < e){
            long long int sum = (long long) nums[i] + (long long) nums[j] + (long long) nums[s] + (long long) nums[e];
            if(target - sum == 0)
            {
              v.push_back({nums[i], nums[j], nums[s], nums[e]});
              s++;
              while(s < e && nums[s] == nums[s - 1]) s++;
            }
            else if(sum < target) s++;
            else e--;
          }
          
        }
      }
      
      return v;
    }
};
