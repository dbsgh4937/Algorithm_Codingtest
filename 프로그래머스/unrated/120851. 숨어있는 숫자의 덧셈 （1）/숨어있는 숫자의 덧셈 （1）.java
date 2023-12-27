class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = my_string.split("");
        
        int i;
        for(i = 0; i < arr.length; i++){
            answer += Integer.valueOf(arr[i]);
        }
        
        return answer;
    }
}