//744. Find Smallest Letter Greater Than Target





class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        int start = 0, end = letters.size()-1, mid = start +(end -start)/2;
        
        char ans = letters[0];
        while(start<=end)
        {
               
              if(letters[mid] > target)
              {
                  ans = letters[mid];
                  end = mid-1;
              }
              
              
            else
            {
                start = mid+1;
            } 
            mid = start +(end -start)/2;
        }
        return ans;
    }
};
