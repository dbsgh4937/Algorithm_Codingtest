class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int first_value = (total / num) - ((num - 1) / 2);
        
        for(int i = 0; i < num; i++){
            answer[i] = first_value;
            first_value++;
        }
        
        return answer;
    }
}