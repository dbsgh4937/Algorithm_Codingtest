class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        //a-z, A-Z의 알파벳들을 null인 ""로 다 replace한다.
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        //arr라는 배열을 하나 만들어서 null기준으로 split한다
        String[] arr = my_string.split("");
        
        int i;
        for(i = 0; i < arr.length; i++){
            //split된 arr에서의 정수값을 integer로 변환해서 answer에 저장
            answer += Integer.valueOf(arr[i]);
        }
        
        return answer;
    }
}