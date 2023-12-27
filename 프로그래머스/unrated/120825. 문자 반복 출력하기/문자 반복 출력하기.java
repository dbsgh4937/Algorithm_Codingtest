class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        int i;
        for(i = 0; i < my_string.length(); i++){
            
            int j;
            
            //my_string의 i번째 문자를 n번 곱해서 answer에 넣는다 순차적으로
            for(j = 0; j < n; j++){
                //my_string의 i번째를 answer에다가 넣는다
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}