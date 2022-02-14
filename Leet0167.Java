//167. Two Sum II - Input Array Is Sorted


class Solution {
    public int[] twoSum(int[] numbers, int target) {
//         int i = 0;
//         int j = numbers.length - 1;
      
//          while(i <= j) {
//             int n = numbers[i] + numbers[j];
//             if(n == target) {
//                 int[] ans = {i+1, j+1};
//                 return ans;
//             } else if(target < n) {
//                 i--;
//             } else {
//                 j++;
//             }
//         }
//         return numbers;
        
        
        
        
        
        int n = numbers.length;
        int first =0;
        int last = n-1;
        int result[] = new int[2];
        
        while(first<=last)
        {
            int sum = numbers[first]+numbers[last];
            if(sum==target)
            {
                result[0]= first+1;
                result[1]=last+1;
                break;
            }
            else if(sum < target)
                first++;
            else
                last--;
        }
        return result;
    }
}
