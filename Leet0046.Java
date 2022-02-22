//46. Permutations


class Solution {    
    private void permuteUntil( int idx, int []nums, List<List<Integer>> ans ){
    
    if( idx == nums.length ){
         List<Integer> tempList = new ArrayList<>();
         for( int i: nums )
         tempList.add(i);
        
        ans.add( new ArrayList<>( tempList ) );
        return;        
    }
    
    for( int i=idx; i<nums.length; i++ ){
        swap( i, idx, nums );
        permuteUntil( idx+1, nums, ans );
        swap( i, idx, nums );
    }
    
}

private void swap( int i, int j, int[] nums ){
    
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    
}
    public List<List<Integer>> permute(int[] nums) {
          List<List<Integer>> ans = new ArrayList<>();
          permuteUntil( 0, nums, ans );
          return ans;
    }
}
