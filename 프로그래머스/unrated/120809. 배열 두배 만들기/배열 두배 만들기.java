class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; //numbers와 길이가 같은 배열로 초기화(똑같은 배열의 크기)
        int i;
        
        for(i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}