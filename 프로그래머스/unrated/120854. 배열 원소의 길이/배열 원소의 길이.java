class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i;
        
        for(i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        

        return answer;
    }
}