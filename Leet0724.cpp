//724. Find Pivot Index



class Solution {
public:
    int pivotIndex(vector<int>& arr) {
        int n=arr.size();
        int sum=0;

       for(int i=0;i<n;i++){
           sum+=arr[i];
       }
       int lsum=0;
        int rsum=sum;
        for(int i=0;i<n;i++){
           rsum-=arr[i];
           if(lsum==rsum)
           return i;
           lsum+=arr[i];
       }
       return -1;
    }
};
