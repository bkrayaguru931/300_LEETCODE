//128. Longest Consecutive Sequence



class Solution {
    public int longestConsecutive(int[] nums) {
        int size = nums.length;
        
        if(size == 0) return 0;
        
        Arrays.sort(nums); 
        int longest = 0;
        int current_longest = 1;
        
        for(int i=1;i<size;i++){
            
            if(nums[i] == nums[i-1]){
                continue; 
            }
            
            else if(nums[i] == nums[i-1] + 1){
                current_longest++;
            }
            
            else{
                longest = Math.max(longest,current_longest);
                current_longest = 1; 
            }
            
        }
        
        return Math.max(longest,current_longest);
    }
}
