//47. Permutations ||



class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        backtrack(nums, 0, list);
        return list;
    }
    
    public void swap(int i, int j, int nums[]){
        int t= nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    
    public void backtrack(int[] nums, int index, List<List<Integer>> list){
        if(index == nums.length){
            List<Integer> tempList = new ArrayList();
            for(int j=0;j<nums.length;j++){
                tempList.add(nums[j]);
            }
            if(!list.contains(tempList)){ 
			
                list.add(new ArrayList(tempList));
            }
            return;
        }
        for(int i=index;i<nums.length;i++){
                swap(index, i, nums);
                backtrack(nums, index+1, list);
                swap(index, i, nums);
        }
    }

}
