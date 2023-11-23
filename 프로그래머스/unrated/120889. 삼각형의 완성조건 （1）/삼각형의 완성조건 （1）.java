import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides); //오름차순으로 배열 정렬
        
        if((sides[0] >= 1 && sides[0] <= 1000) && 
           (sides[1] >= 1 && sides[1] <= 1000) && 
           (sides[2] >= 1 && sides[2] <= 1000))
        {
            if((sides[0] + sides[1]) > sides[2]){
                answer = 1;
            }
            else{
                answer = 2;
            }
        }
        else{
            answer = 2;
        }
            
        return answer;
    }
}