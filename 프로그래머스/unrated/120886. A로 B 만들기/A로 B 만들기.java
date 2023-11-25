import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        //문자열을 배열로 일단 바꾸기
        char[] before_array = before.toCharArray();
        char[] after_array = after.toCharArray();   
        
        //before, after마다 만들어놓은 배열을 sorting
        Arrays.sort(before_array);
        Arrays.sort(after_array);
        
        if(Arrays.equals(before_array, after_array)){
            answer = 1;
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}