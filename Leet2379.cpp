//2379. Minimum Recolors to Get K Consecutive Black Blocks





class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int i = 0, j = 0, count_w = 0, ans = INT_MAX;
        while(j < blocks.size()){
            if(blocks[j] == 'W'){ 
                count_w++; 
                }
            if(j - i + 1 == k){
                ans = min(ans, count_w);
                if(blocks[i] == 'W') 
                count_w--;
                i++;
            }
            j++;
        }
        return ans;
    }
};
