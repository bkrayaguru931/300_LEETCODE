//49. Group Anagrams





class Solution {
      public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        int i;
        for(i=0;i<strs.length;i++){
            String temp = strs[i];
            char[] tempChars = temp.toCharArray();
            Arrays.sort(tempChars);
            String temp1 = new String(tempChars);
            if(map.containsKey(temp1) == false){
                List<String> list = new ArrayList<>();
                list.add(temp);
                map.put(temp1, list);
            }
            else{
                List<String> list = map.get(temp1);
                list.add(temp);
                map.put(temp1, list);
            }
        }
        
        List<List<String>> ans = new ArrayList<List<String>>();
        for(Map.Entry<String, List<String>> m : map.entrySet()){
            List<String> l = m.getValue();
            ans.add(l);
        }
        return ans;
    }
}
