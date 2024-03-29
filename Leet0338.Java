//338. Counting Bits


class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i=0;i<=n;i++){
            result[i] =getBit(i);
        }
        return result;
    }
    
    public int getBit(int num){
        int count =0;
         while (num > 0) {
            int binaryNum = num % 2;
             if(binaryNum==1) count++;
            num = num / 2;
        }
        return count;
    }
}
