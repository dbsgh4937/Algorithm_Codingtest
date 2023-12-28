class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        
        for(int i = 1; i <= 10; i++){
            factorial *= i;
            
            //팩토리얼 값과 n값이 같을 때
            if(factorial == n){
                answer = i;
                break;
            }
            
            //팩토리얼 값이 n이상이 되서 최대 팩토리얼 값을 넣을 때
            else if(factorial > n){
                answer = (i - 1);
                break;
            }         
        }        
        
        return answer;
    }
}