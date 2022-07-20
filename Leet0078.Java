//78. Subsets



// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//          List<List<Integer>> result = new ArrayList<>();
//         result.add(new ArrayList<>());
        
//         for(int num: nums)
//         {
//             int n=result.size();
//             for(int i=0;i<n;i++)
//             {
//                 List<Integer> list=new ArrayList<>(result.get(i));
//                 list.add(num);
//                 result.add(list);
//             }
//         }
//         return result;
//     }
// }

//or

class Solution {
 public static void helper(int[] nums,int i , List<Integer> subSet, List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList(subSet));
            return;
        }
        
		//include the ith element
        subSet.add(nums[i]);
        helper(nums,i+ 1,subSet,ans);
		
        //not include the ith element
        subSet.remove(subSet.size()-1);
        helper(nums,i+ 1,subSet,ans);
        
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subSet = new ArrayList<>();
        
        helper(nums,0,subSet,ans);
        return ans;
        
    }
}
