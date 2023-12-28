import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toLowerCase().toCharArray();        
        
        Arrays.sort(ch);
        
        answer = new String(ch);
        
        return answer;
    }
}