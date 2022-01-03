//1010. Pairs of Songs With Total Durations Divisible by 60


class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        //TC = O(N^2)
        //SC = O(1)
        
         int count = 0;
         for(int i = 0; i < time.length - 1; i++){
             for(int j = i + 1 ; j < time.length ; j++){
                 if((time[i] + time[j]) % 60 == 0){
                     count++;
                 }
             }
         }
         return count ;
        
        //TC = O(N)
        
        int[] rem = new int[60];  
        int count = 0;
        for(int t:time){
            if(t % 60 == 0)
                count += rem[0];
            else
                count += rem[60 - t % 60];
            rem[t % 60]++;
        }
        return count;        
    }
}
