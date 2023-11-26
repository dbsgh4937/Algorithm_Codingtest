import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        my_string = my_string.replaceAll("[a-z]", "");
        
        //split메소드를 사용하기 위해 문자열 배열을 선언할 것이다.
        String[] arr = my_string.split("");
        int[] answer = new int [arr.length];
        
        int i;
        for(i = 0; i < arr.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}