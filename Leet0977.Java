//977. Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
//         for(int i=0 ; i < nums.length ; i++){
//             nums[i] = (int) Math.pow(nums[i],2);
//         }
//                    Arrays.sort(nums);
//                    return nums;
        
        
        //OR
        
        //l==low h==high
        int l=0,h=nums.length-1;
        int p=h;
        int [] square = new int [nums.length];
        
        while(l<=h){
            if(Math.abs(nums[l])>Math.abs(nums[h])){
                square[p]=nums[l] * nums[l];
                l++;
            }
            else{
                square[p]=nums[h] * nums[h];
                h--;
            }
             p--;
        }
        return square;
    }
}
