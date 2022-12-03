//1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold




class Solution {
public:
    int numOfSubarrays(vector<int>& arr, int k, int threshold) {
    int n=arr.size();
    int i=0,j=0;
    long int sum=0;
    int count=0;  
    while(j<n)
    {
        sum+=arr[j];
        if(j-i+1<k) 
        j++;
        else if(j-i+1==k)
        {
            // compute ans
           if(sum/k>=threshold)
                count++;
            sum-=arr[i];
            i++;
            j++;
        }
    }
    return count;
    }
};
