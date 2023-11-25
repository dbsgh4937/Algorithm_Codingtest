class Solution {
    public int solution(int hp) {
        //장군개미 공 5, 병정개미 공 3, 일개미 공 1 이를 통한 최소한의 병사 수 구하기
        //크면 클수록 아래쪽으로 내려가는 일이 없을거니까 로직짤때 위쪽 개체수부터만 생각하면 될듯
        int answer = 0;
        
        //장군개미 개체수 구하고 나머지를 생각
        answer = hp / 5;
        hp %= 5;
        
        answer += hp / 3;
        hp %= 3;
        
        answer += hp / 1;
        hp %= 1;        
        
        return answer;
    }
}