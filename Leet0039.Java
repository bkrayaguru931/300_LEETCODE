//39. Combination Sum



class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSumBackTracking(candidates, target , result, new ArrayList<>(), 0);
        return result;
    }
    
    public void combinationSumBackTracking(int[] candidates, int target, List<List<Integer>> result, List<Integer> tempList, int start) {
        if(target == 0) 
            result.add(new ArrayList<>(tempList));
        else if(target < 0) 
            return;
        else {
            for(int i=start;i< candidates.length;i++) {
                tempList.add(candidates[i]);
                combinationSumBackTracking(candidates, target - candidates[i], result, tempList, i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
