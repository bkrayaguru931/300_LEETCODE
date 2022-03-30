//1512. Number of Good Pairs


class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;i++){
        //         if(nums[i]==nums[j])
        //             count++;
        //     }
        // }
        // return count;
        
       int count=0;
        int freq[]=new int[101];
        for(int num: nums)
            count+=freq[num]++;
        return count;
            
    }
}
