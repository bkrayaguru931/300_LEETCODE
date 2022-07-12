//10. Regular Expression Matching



class Solution {
    public boolean isMatch(String s, String p) {
      if(p.length()==0){
            return s.length()==0;
        }
        boolean firstMatch = false;
        if(s.length()>0){
            firstMatch = (s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')?true:false;
        }
        if(p.length()>1 && p.charAt(1)=='*'){
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        }
        return firstMatch && isMatch(s.substring(1), p.substring(1));  
    }
}
