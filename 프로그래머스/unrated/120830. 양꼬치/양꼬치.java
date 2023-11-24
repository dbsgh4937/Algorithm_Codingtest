class Solution {
    public int solution(int n, int k) { //양꼬치 n인분, 음료수 k개
        
        int answer = 0;
        
        answer = (n * 12000) + ((k - (n / 10)) * 2000);
        
        return answer;
    }
}