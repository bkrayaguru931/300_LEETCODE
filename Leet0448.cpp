


//448. Find All Numbers Disappeared in an Array




class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int> v;
        unordered_map<int, int> map;
        
        for(int x : nums)
            map[x]++;
        
        for(int i=1 ; i<=nums.size() ; i++)
		{
            if((map.find(i) == map.end()))
                v.push_back(i);
        }
        return v;
    }
};
