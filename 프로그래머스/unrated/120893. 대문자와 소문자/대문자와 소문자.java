class Solution {
    public String solution(String my_string) {
        String answer = "";
        int i;
        //문자열의 길이를 알아야하니까 length가 아닌 length()를 사용
        for(i = 0; i < my_string.length(); i++){
            if(Character.isUpperCase(my_string.charAt(i))){
                answer += Character.toLowerCase(my_string.charAt(i));
            }
            else{
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
                
        return answer;
    }
}