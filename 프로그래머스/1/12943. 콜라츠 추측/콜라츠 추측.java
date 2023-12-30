class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while(num != 1){
            
            if(answer >= 500){
                answer = -1;
                break;
            }
            
            //짝수 case(1-1)
            if(num % 2 == 0){
                num = num / 2;
            }
            
            //홀수 case(1-2)
            else if(num % 2 == 1){
                num = (num * 3) + 1;
            }
            
            answer++; 
                      
        }       
       
        return answer;
    }
}