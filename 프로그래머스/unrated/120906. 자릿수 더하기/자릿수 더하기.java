class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //정수 n을 string으로 바꿔서 하나씩 넣기 위해
        //s라는 string을 만들어서 
        String s = Integer.toString(n);
        
        int i;
        //string 문자열의 길이니까 ()를 붙여야 한다.
        for(i = 0; i < s.length(); i++){
            //s의 string을 하나씩 정수로 추출 될 수 있게한다 i~i+1
            answer += Integer.parseInt(s.substring(i, i + 1));
        }
        
        return answer;
    }
}