//8. String to Integer (atoi)




import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public int myAtoi(String s) {
        Pattern pattern = Pattern.compile("^[\s]*[+|-]??[0-9]+");
        Matcher matcher = pattern.matcher(s);
        if (!matcher.find()) {
            return 0;
        }
        String num = matcher.group().trim();
        try {
            return Integer.valueOf(num);
        } catch (NumberFormatException e) {
            return "-".equals(num.substring(0, 1)) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
