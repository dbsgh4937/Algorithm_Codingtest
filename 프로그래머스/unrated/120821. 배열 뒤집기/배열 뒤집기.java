class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int i;
        
        for(i = 0; i < num_list.length; i++){
            answer[num_list.length - i - 1] = num_list[i];
        }
        
        return answer;
    }
}