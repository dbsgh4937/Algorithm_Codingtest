class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        //2진수 덧셈을 하는 방식으로 paserInt, toBinaryString을 사용
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        
        int result = num1 + num2;
        answer = Integer.toBinaryString(result);        
        
        return answer;
    }
}