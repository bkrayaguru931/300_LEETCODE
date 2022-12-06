




class Solution {
 public String[] uncommonFromSentences(String A, String B) {
    //prepare a String[] for result
    String[] result =null;
    
    //check for extreme condition
    if(A.length() == 0 && B.length() == 0){
        return result;
    }
    
    //convert string to string[]
    String[] arrayA = A.split("\\s");
    String[] arrayB = B.split("\\s");
    
    //create a HashMap for arrayA
    HashMap<String, Integer> map = new HashMap<> ();
    for(String a : arrayA){
        map.put(a, map.getOrDefault(a, 0) + 1);
    }
    
    for(String b : arrayB){
        map.put(b, map.getOrDefault(b, 0) + 1);
    }
    
    //need an ArrayList for modifying elements
    ArrayList<String> list = new ArrayList<> ();
    
    for(String s : map.keySet()){
        if(map.get(s).equals(1)){
            list.add(s);
        }
    }
    
    //convert s to result
    String[] ans = new String[list.size()];
    list.toArray(ans);
    
    return ans;
 }
}
