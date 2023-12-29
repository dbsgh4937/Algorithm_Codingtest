class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
                
        int up_value = (numer1 * denom2) + (numer2 * denom1);
        int down_value = denom1 * denom2;
        
        for(int i = (up_value - 1); i > 1; i--){
            if((up_value % i == 0) && (down_value % i == 0)){
                up_value /= i;
                down_value /= i;
            }
        }
        
        int[] answer = {up_value, down_value};
        
        return answer;
    }
}