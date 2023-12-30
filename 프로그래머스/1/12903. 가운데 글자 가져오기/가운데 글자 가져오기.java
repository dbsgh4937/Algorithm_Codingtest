class Solution {
    public String solution(String s) {
        String answer = "";
        
        //갯수가 홀수일때
        if(s.length() % 2 == 1){
            answer += s.charAt(s.length() / 2);
        }
        //갯수가 짝수일때
        else if(s.length() % 2 == 0){
            answer += s.charAt((s.length() / 2) - 1);
            answer += s.charAt(s.length() / 2);
        }
        
        return answer;
    }
}