import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int p_value, m_value = 0;   //양수쪽, 음수쪽 최대값만 확인해서 도출시키기
        Arrays.sort(numbers);       
                
        //양수쪽에서 최대값
        p_value = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        //음수쪽에서 최대값 구하는데 number[1]이 음수면 어차피 최대값 안되고 음, 음인 경우에서 확인하기 위해 작성
        m_value = numbers[0] * numbers[1];
        
        if(p_value > m_value){
            answer = p_value;
        }
        else{
            answer = m_value;
        }       
        
        return answer;
    }
}