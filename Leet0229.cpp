//229. Majority Element II



class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
    vector<int> res;
    unordered_map<int, int> ma;
    int dim = nums.size();
    
    for(auto& el: nums)
    {
        ma[el]++;
    }
    
    for(auto& el: ma)
    {
        if(el.second > dim / 3)
        {
            res.push_back(el.first);
        }
    }
    
    return res;
    }
};
