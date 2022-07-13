
//38. Count and Say



class Solution {
    public String countAndSay(int n) {
         String output="1";
        if(n==1){
            return "1";
        }
        int counter=1;
        while(n!=counter){
            System.out.println(output);
            String temp=output;
            output="";
            for(int i=0;i<temp.length();i++){
                int key=Integer.parseInt(String.valueOf(temp.charAt(i)));
                int count=0;
                for(int j=i;j<temp.length();j++){
                    if(key==Integer.parseInt(String.valueOf(temp.charAt(j)))){
                        count++;
                        i++;
                    }else{
                        i--;
                        break;
                    }
                }
                output+=String.valueOf(count)+String.valueOf(key);
            }
            counter++;
            
        }
        return output;
    }
}
