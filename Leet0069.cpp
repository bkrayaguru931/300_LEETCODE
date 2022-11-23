//69. Sqrt(x)




class Solution {
public:
    long long int mySqrt(int x) {
        int start=0;
        int end=x;
        long long int mid=start+(end-start)/2;
        long long int ans=-1;
        while(start<=end){
        long long int sqr = mid*mid;

            if(sqr==x)
            return mid;
            if(sqr<x){
                 ans=mid;
                start=mid+1;
            }
            else {
                end=mid-1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }
          
};
