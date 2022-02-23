//70. Climbing Stairs


class Solution {
    public int climbStairs(int n) {
        int Arr[]= new int [n+1];
        Arr[0] = 1;
        Arr[1] = 2;
        for(int i=2;i<n+1;i++){
        Arr[i]=Arr[i-1]+Arr[i-2];
          }
         return Arr[n-1];
    }
}
