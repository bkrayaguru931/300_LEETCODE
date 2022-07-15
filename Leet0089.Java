//89. Grey Code



class Solution {
    public List<Integer> grayCode(int n) {
          int s = (int)Math.pow(2,n);
        List<Integer> res = new ArrayList();
        res.add(0);
        for(int i=1; i<s; i++) res.add(i^(i>>1));
        return res;
    }
}
