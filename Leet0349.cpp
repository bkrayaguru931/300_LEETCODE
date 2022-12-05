//349. Intersection of Two Arrays





class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
         unordered_set<int> a;
        
        vector<int> e;
        
        for(int b : nums1){
            a.insert(b);
        }
        for(auto f : nums2){
            if(a.count(f)){
                e.push_back(f);
                a.erase(f);
            }    
        }
        return e;
    }
};
