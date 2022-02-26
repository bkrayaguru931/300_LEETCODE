//278. First Bad Version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int res = n;
        while(low<=high){
            int mid = low + (high - low) / 2;
            boolean isBad = isBadVersion(mid);
            if(isBad){
                res = mid ;
                high = mid -1 ;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }
}

           //OR

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      int low = 1;
        int high = n;
        int ans = 0;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(isBadVersion(mid)==true){
                ans = mid;
                high=mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
}
