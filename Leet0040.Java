//40. Combination Sum II



class Solution {
   public List<List<Integer>> combinationSum2(int[] arr, int t) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        return fun(list,arr,t,0,0, new ArrayList<Integer>());
    }
    static List<List<Integer>> fun(List<List<Integer>> list,int[]arr, int t, int i, int sum, List<Integer> li) {
        for (int j = i; j < arr.length; j++) {
            if(j>i && arr[j]==arr[j-1])
                continue;
            if (sum + arr[j] == t) {
                li.add(arr[j]);
                list.add(new ArrayList<Integer>(li));
                li.remove(li.size()-1);
                break;
            }
            else if(sum + arr[j] < t) {
                li.add(arr[j]);
                sum += arr[j];
                list = fun(list,arr,t,j+1, sum, li);
                sum -= arr[j];
                li.remove(li.size()-1);
            }
            else
                break;
        }
        return list;
    }
}
