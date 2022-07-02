//13. Roman to Integer



class Solution {
   private static HashMap<Character, Integer> decode = new HashMap<>();
    static {
        decode.put('I', 1);
        decode.put('V', 5);
        decode.put('X', 10);
        decode.put('L', 50);
        decode.put('C', 100);
        decode.put('D', 500);
        decode.put('M', 1000);
    }
    
    public int romanToInt(String s) {
        int sum = 0;
        int prev = 0;
        char[] symbols = s.toCharArray();
        
        for (int i = symbols.length - 1; i >= 0; i--) {
            int value = decode.get(symbols[i]);
            
            if (value < prev) // IX
                sum -= value;
            else 
                sum += value;
            
            prev = value;
        }
        
        return sum;
    }
}
