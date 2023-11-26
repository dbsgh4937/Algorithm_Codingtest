class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;     //곱셈 연산하기 위한 '1' 초기화
        int i;
        
        for(i = 0; i < box.length; i++){
            answer *= box[i] / n;
        }
        
        return answer;
    }
}