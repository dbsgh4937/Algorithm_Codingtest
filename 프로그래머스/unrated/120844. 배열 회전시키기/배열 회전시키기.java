class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int[] answer = new int[numbers.length];
        
        int i;
        
        //ex) numbers[1,2,3], answer[3,1,2]
        if(direction.equals("right")){
            for(i = 1; i < numbers.length; i++){
                answer[i] = numbers[i - 1];    
            }
            answer[0] = numbers[numbers.length - 1];
        }
        //ex) numbers[1,2,3], answer[2,3,1]
        else{
            for(i = 0; i < (numbers.length - 1); i++){
                answer[i] = numbers[i + 1];
            }
            answer[numbers.length - 1] = numbers[0];
        }     
        
        return answer;
    }
}