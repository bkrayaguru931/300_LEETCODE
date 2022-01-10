class Solution {
    public String addBinary(String a, String b) {
        int carry=0,i=0;
      String result="";
   int al=a.length()-1;
   int bl=b.length()-1;      
       
    while(i<=al || i <= bl || carry!=0){
       int x=0;
       if(i<=al && a.charAt(al-i)=='1') x=1;
        
      int y=0;
       if(i<=bl && b.charAt(bl-i)=='1') y=1;
          
      result=(x+y+carry) %2 +result;
        carry=(x+y+carry)/2;
        i++;
        
    }    
        return result;
    }
}
