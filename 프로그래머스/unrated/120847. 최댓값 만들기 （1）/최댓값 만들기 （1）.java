import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        //배열을 오름차순으로 정렬
        Arrays.sort(numbers); 
        
        //배열을 오름차순으로 정렬했으니 Max(answer)값은 뒤에 2개의 곱
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];

    }
}