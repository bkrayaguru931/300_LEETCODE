//217. Contains Duplicate


class Solution {
    public boolean containsDuplicate(int[] nums) {
       //  Arrays.sort(nums);            T.C=(nlogn)
       //  for(int i = 0; i < nums.length ; i++){
       //      if(nums[i+1] == nums[i]){
       //          return true;
       //      }
       //  }
       // return false;
                   //OR 
      //     T.C =(n)
         HashSet<Integer> set = new HashSet<>();
    
        for(int i = 0; i < nums.length; i++){
        
        if(!set.add(nums[i]))
            return true;
         }
    
         return false;  
    }
}
