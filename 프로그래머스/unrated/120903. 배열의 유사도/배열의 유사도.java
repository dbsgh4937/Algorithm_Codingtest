class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        int i;
        for(i = 0; i < s1.length; i++){
            int j = 0;
            for(j = 0; j < s2.length; j++){
                if(s1[i].equals(s2[j])){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}