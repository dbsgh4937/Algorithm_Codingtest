class Solution {
    public int[] solution(int n) {
        int arr_length = 0;
        int i;
        
        for(i = 1; i <= n; i++){
            if(n % i == 0){
                arr_length++;
            }
        }
        
        int[] answer = new int[arr_length];
        int index_value = 0;
        
        for(i = 1; i <= n; i++){
            if(n % i ==0){
                answer[index_value] = i;
                index_value++;
            }
        }
        
        return answer;
    }
}