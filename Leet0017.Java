//17. Letter Combinations of a Phone Number




class Solution {
    String code[]={".;","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    boolean check=true;
    public List<String> letterCombinations(String digits) {
        
        
        if(digits.length()==0 && check==true){
            List<String> bres=new ArrayList<>();
            return bres;
        }
        if(digits.length()==0 && check==false){
            List<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch=digits.charAt(0);
        String ros=digits.substring(1);
        check=false;
        List<String> res=letterCombinations(ros);
        
        
        String s=code[ch-'0'-1];
        List<String> mres=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            for(String str:res){
                mres.add(c+str);
            }
        }
        return mres;
        
    }
}
