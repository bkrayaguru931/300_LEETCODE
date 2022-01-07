// 1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
//         int res[] = new int[2];
//         for(int i = 0 ;i < nums.length-1; i++){
//             for(int j = i;j < nums.length; j++){
//                   int alt = target - nums[i];
//                      if(alt==nums[j]){
                         
//                          res[0] = i;
//                          res[1] = j;
//                      }    
                     
//             }
          
//         }
//           return res;     
        
        
    Map<Integer,Integer> map = new HashMap<>();        
	for(int i=0; i<nums.length; map.put(nums[i],i),i++){
		int j = target-nums[i];
		if(map.containsKey(j) && map.get(j)!=i)
			return new int[]{i,map.get(j)};             
	}        
	return new int[]{};
    }
}
