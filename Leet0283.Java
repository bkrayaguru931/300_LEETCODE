//283. Move Zeroes


class Solution {
    public void moveZeroes(int[] nums) {
//         int zero=0;
//         for(int i=0;i<nums.length;i++) {
//             if(nums[i]==0) {
//                 zero++;
//             } else if(zero>0) {
//                 nums[i-zero]=nums[i];
//                 nums[i]=0;
//             }
//         }
        
      //OR
      
       int i = 0;
        int j = 0;
        while (i < nums.length) {
        if (nums[i] != 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
               j++;
              }
       i++;
     }
    }
}
