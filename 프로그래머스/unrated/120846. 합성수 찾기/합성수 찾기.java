class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int i;
        for(i = 1; i <= n; i++){
            int count = 0;
            int j;
            
            for(j = 1; j <= n; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count >= 3){
                answer++;
            }
        }
        
        return answer;
    }
}