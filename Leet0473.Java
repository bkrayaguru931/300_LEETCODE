//473. Matchsticks to Square



class Solution {
    public boolean makesquare(int[] matchsticks) {
         int sum = Arrays.stream(matchsticks).sum(), N = matchsticks.length;
        if (sum % 4 != 0){
            return false;
        }
        sum/=4;
        int[] got = new int[1<<N];
        boolean[] dp = new boolean[1<<N];
        List<Integer> ok = new ArrayList<>();
        for (int i = 0; i < N; i++){ 
            got[1<<i]=matchsticks[i];
        }
        for (int i = 1; i < 1<<N; i++){
            got[i]=got[i&-i]+got[i&(i-1)];
            if (got[i]==sum){ 
                for (int m : ok){
                    if ((m&i)==0){
                        dp[m|=i]=true;
                        if (dp[m^((1<<N)-1)]){ 
                            return true;
                        }
                    }
                }
                ok.add(i);
            }
        }
        return false;
    }
}
