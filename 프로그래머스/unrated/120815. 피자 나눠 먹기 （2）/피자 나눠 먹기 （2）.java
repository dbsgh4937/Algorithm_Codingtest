class Solution {
    public int solution(int n) {
//ex) 6조각, 10명(n)일 때 최소 피자 갯수(answer)은 5개이다.
        int answer = 0;
        int i;
        
        for(i = 1; i <= n; i++){
            if(i * 6 % n == 0){
                answer = i;
                break;
            }    
        }
                
        return answer;
    }
}

