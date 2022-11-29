//1047. Remove All Adjacent Duplicates In String




class Solution {
    public String removeDuplicates(String str) {
        Stack<Character> s=new Stack();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!s.isEmpty()&&s.peek()==str.charAt(i)){
                s.pop();
            }
            else s.add(str.charAt(i));

        }
        while(!s.isEmpty())
        sb.append(s.pop());

        return sb.reverse().toString();
    }
}
