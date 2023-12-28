import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        
        //위에서 str은 배열이라고 선언했으니까 str.length로
        //위에서 String str로 선언해서 string을 사용할 때는 아래에서 str.length()를 사용
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("Z")){
                answer -= Integer.parseInt(str[i - 1]);;
            }
            else{
                answer += Integer.parseInt(str[i]);;
            }
        }
        
        return answer;
    }
}