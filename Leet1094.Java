class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
            int car = 0;        
        int[] incr = new int[1001];
        for (int i = 0; i < trips.length; i ++) {
            
            incr[trips[i][1]] += trips[i][0];
            incr[trips[i][2]] -= trips[i][0];
        }
        for (int i = 0; i <= 1000; i ++) {
            
            car += incr[i];
            if (car > capacity) 
                return false;
            
        }
        return true;   
    }
}
