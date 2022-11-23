//852. Peak Index in a Mountain Array



class Solution {
public:
    int peakIndexInMountainArray(vector<int>& v) {
        int s = 0, e = v.size() - 1;
        int mid=(s + e) / 2;
        while (s < e)
        {
            if(v[mid] < v[mid+1])
                    s=mid+1;
                else
                    e = mid;
        
            mid = (s + e) / 2;
        }
        return s;
    }
};
