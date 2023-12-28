import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String str = Arrays.toString(array);
        String[] arr = str.split("");
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("7")){
                answer++;
            }
        }
        
        
        return answer;
    }
}